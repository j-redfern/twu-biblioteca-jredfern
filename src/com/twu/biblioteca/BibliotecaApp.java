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

        UserValidation userInput = new UserValidation();
        boolean userInputValidate = userInput.validateUser(line);

        ListOfBooks books = new ListOfBooks();

        if(userInputValidate){

            if(line.contains("customer")) {

                System.out.println("");
                System.out.println("Here is a list of books available for rent:");
                System.out.println("");
                System.out.println("  ==============================================================");
                System.out.println("  BOOK TITLE                                                  ");
                System.out.println("  AUTHOR | YEAR PUBLISHED                                      ");
                System.out.println("  ==============================================================");

                List<ListOfBooks> currentLibrary =  books.currentBookCollection();

                   for (int i = 0 ; i < currentLibrary.size(); i++) {

                       System.out.println("");
                       System.out.println("  " + currentLibrary.get(i).bookTitle);
                       System.out.println("  By " + currentLibrary.get(i).authorName + " | " + currentLibrary.get(i).yearPublished);
                       System.out.println("  ______________________________________________________________");
                   }

                   System.out.println("");
                   System.exit(0);
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
