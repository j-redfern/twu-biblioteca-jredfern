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
        boolean userInputValidate = userInput.validateDataInput(line);


        if(userInputValidate){

            if(line.contains("customer")) {

                ListOfBooks books = new ListOfBooks();

                System.out.println("---------------------------------");
                System.out.println("           Main Menu");
                System.out.println("---------------------------------");

                System.out.println("");
                System.out.println("To select the option, type the word(s) in the bracket");
                System.out.println("1. List of books (books) ");

                input.hasNext();
                String lineTwo = input.nextLine().toLowerCase();

                DataInputValidation mainMenuInput = new DataInputValidation();
                boolean mainMenuInputValidate = mainMenuInput.validateDataInput(lineTwo);

                if (mainMenuInputValidate) {

                    System.out.println("");
                    System.out.println("Here is a list of books available for rent:");
                    System.out.println("");

                    MainMenu menuOption = new MainMenu(books);
                    menuOption.executeOption(lineTwo);
                    System.exit(0);
                }
            }

            if(line.contains("employee")) {
                    System.out.print("working");
                    System.exit(0);
            }

        }
        System.out.print("Invalid input abcde");
        System.exit(0);
    }
}
