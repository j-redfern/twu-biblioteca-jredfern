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

            ListOfBooks books = new ListOfBooks();

            if(line.contains("customer")) {
                System.out.println("---------------------------------");
                System.out.println("           Main Menu");
                System.out.println("---------------------------------");
                System.out.println("");
                System.out.println("To select the option, type the word(s) in the bracket");
                System.out.println("1. List books (books) ");
                System.out.println("2. To Quit (quit) ");

                String inputToContinue = "yes";

                MainMenu menuOption = new MainMenu(books);

                while (inputToContinue == "yes") {

                    input.hasNext();
                    String lineTwo = input.nextLine().toLowerCase();

                    DataInputValidation mainMenuInput = new DataInputValidation();
                    boolean mainMenuInputValidate = mainMenuInput.validateStringDataInput(lineTwo);

                    if (mainMenuInputValidate) {
                        menuOption.executeOption(lineTwo);
                        inputToContinue = menuOption.InputToContinue;
                    } else {
                        inputToContinue = "yes";
                        System.out.println("Select a valid option");
                        menuOption.optionMenu2();
                    }
                }

                if (inputToContinue == "quit") {
                    System.exit(0);
                }

                input.hasNext();
                String lineThree = input.nextLine();

                DataInputValidation checkoutInput = new DataInputValidation();
                boolean checkoutInputValidate = checkoutInput.validateNumericDataInput(lineThree);

                inputToContinue = "yes";

                while (inputToContinue != null) {

                    if (inputToContinue == "yes") {
                        if (checkoutInputValidate) {
                            CheckOutABook checkOut = new CheckOutABook(books);
                            checkOut.checkOutABook(Integer.parseInt(lineThree));
                            inputToContinue = checkOut.checkOutMenu ;
                        }
                        else {
                            System.out.print("Invalid input. Try again");
                            System.exit(0);
                        }
                    }

                    if (inputToContinue == "tryAgain") {
                        input.hasNext();
                        String bookNumberInput = input.nextLine();

                        DataInputValidation bookNoInput = new DataInputValidation();
                        boolean bookNoInputValidate = bookNoInput.validateNumericDataInput(bookNumberInput);

                        if (bookNoInputValidate) {
                            CheckOutABook checkOut = new CheckOutABook(books);
                            checkOut.checkOutABook(Integer.parseInt(bookNumberInput));
                            inputToContinue = checkOut.checkOutMenu;

                        } else {
                            System.out.print("Invalid input. Try again");
                            System.exit(0);
                        }
                    }
                }
            }
            else{
                    System.out.print("Invalid user input");
                    System.exit(0);
                }

        }
        else {
            System.out.print("Invalid input");
            System.exit(0);
        }
    }
}
