package com.twu.biblioteca;

public class MainMenu {

    public String optionSelected;
    public ListOfBooks library;


    public MainMenu (ListOfBooks bookObject){
        library = bookObject;
    }

    public void executeOption(String optionChoice){

        optionSelected = optionChoice;

        switch(optionSelected){
            case "books":
                library.printCurrentBookCollection();
                break;

            default:
                System.out.println("Invalid option selection");
        }
    }
    }
