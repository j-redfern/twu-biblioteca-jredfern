package com.twu.biblioteca;

import java.util.Scanner;

public class BibliotecaApp {

    public static void main(String[] args) {

        System.out.println("---------------------------------");
        System.out.println("  Welcome to Biblioteca Library! ");
        System.out.println("---------------------------------");

        System.out.println("Please advise if you are a customer or employee");

        Scanner input = new Scanner(System.in);
        input.hasNext();
        String line = input.nextLine().toLowerCase();

        UserValidation userInput = new UserValidation();
        boolean userInputValidate = userInput.validateUser(line);

        ListOfBooks books = new ListOfBooks();

        if(userInputValidate){

            if(line.contains("customer")) {
                System.out.println("Here is a list of books available...");
                System.out.println("");
                books.getBookList();
                System.exit(0);
            }

            if(line.contains("employee")) {
                System.out.print("working");
                System.exit(0);
            }
            else {
                System.out.print("Invalid input");
                System.exit(0);
            }
        }
        System.out.print("Invalid input");
        System.exit(0);
    }
}
