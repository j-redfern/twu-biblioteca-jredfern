package com.twu.biblioteca;

public class MainMenu {

    public String optionSelected;
    public ListOfBooks library;
    public String validOptionInput;


    public MainMenu (ListOfBooks bookObject){
        library = bookObject;
    }

    public void executeOption(String optionChoice){

        optionSelected = optionChoice;

        switch(optionSelected){
            case "books":
                System.out.println("");
                System.out.println("Here is a list of books available for rent:");
                System.out.println("");
                library.printCurrentBookCollection();
                validOptionInput = "no";
                System.out.println("");
                System.out.println("Type quit to exit Main Menu");
                break;

            case "quit":
                validOptionInput = "yes";
                break;

            default:
                validOptionInput = "no";
                System.out.println("Select a valid option!");
                System.out.println("1. List books (books) ");
                System.out.println("2. To Quit (quit) ");
        }
    }
    }
