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
                validOptionInput = "yes";
                break;

            default:
                validOptionInput = "no";
                System.out.println("Select a valid option!");
        }
    }
    }
