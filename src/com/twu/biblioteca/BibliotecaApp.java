package com.twu.biblioteca;

import java.util.Scanner;
import java.util.List;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("  Welcome to Biblioteca Library! ");
        System.out.println("---------------------------------");

        System.out.println("Please advise if you are a customer or employee");

        Scanner input = new Scanner(System.in);
        input.hasNext();
        String line = input.nextLine().toLowerCase();

        DataInputValidation userInput = new DataInputValidation();
        boolean userInputValidate = userInput.validateStringDataInput(line);


        if(userInputValidate){

            System.out.println("---------------------------------");
            System.out.println("           Main Menu");
            System.out.println("---------------------------------");

            ListOfBooks books = new ListOfBooks();

            if(line.contains("customer")) {
                System.out.println("");
                System.out.println("To select the option, type the word(s) in the bracket");
                System.out.println("1. List books (books) ");
                System.out.println("2. To Quit (quit) ");

                String inputToContinue = "yes";

                while(inputToContinue == "yes"){

                    input.hasNext();
                    String lineTwo = input.nextLine().toLowerCase();

                    DataInputValidation mainMenuInput = new DataInputValidation();
                    boolean mainMenuInputValidate = mainMenuInput.validateStringDataInput(lineTwo);

                    if(mainMenuInputValidate) {
                        MainMenu menuOption = new MainMenu(books);
                        menuOption.executeOption(lineTwo);
                        inputToContinue = menuOption.InputToContinue;
                    } else {
                        inputToContinue = "no";
                    }
                }

                input.hasNext();
                String lineThree = input.nextLine();

                DataInputValidation checkoutInput = new DataInputValidation();
                boolean checkoutInputValidate = checkoutInput.validateNumericDataInput(lineThree);

                inputToContinue = "yes";

                while(inputToContinue == "yes") {
                    if (checkoutInputValidate) {
                        System.out.println("working");
                        System.exit(0);
                    } else {
                        System.out.print("Invalid input. Try again");
                        System.exit(0);
                    }
                }
            }

            if(line.contains("employee")) {
                System.out.print("working");
                System.exit(0);
            }

        } else {
            System.out.print("Invalid input abcde");
            System.exit(0);
        }
    }
}
