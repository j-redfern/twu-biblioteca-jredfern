package com.twu.biblioteca;

public class MainMenu {

    public String optionSelected;
    public ListOfBooks library;
    public String InputToContinue;


    public MainMenu (ListOfBooks bookObject){
        library = bookObject;
    }

    public String optionMenu1(){
        System.out.println("---------------------------------");
        System.out.println("           Main Menu");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("To select the option, type the word(s) in the bracket");
        System.out.println("");
        System.out.println("1. List books (books) ");
        System.out.println("2. To Quit (quit) ");
        InputToContinue = "yes";
        return InputToContinue;
    }

    public String optionMenu2(){
        System.out.println("");
        System.out.println("To select the option, type the word(s) in the bracket");
        System.out.println("1. Check out a book (out)");
        System.out.println("2. Back to Main menu (back)");
        InputToContinue = "yes";
        return InputToContinue;
    }

    public String optionMenu3(){
        System.out.println("---------------------------------");
        System.out.println("           Main Menu");
        System.out.println("---------------------------------");
        System.out.println("");
        System.out.println("To select the option, type the word(s) in the bracket");
        System.out.println("");
        System.out.println("1. Check out book (out) ");
        System.out.println("2. To Quit (quit) ");
        InputToContinue = "yes";
        return InputToContinue;
    }

    public String optionMenu4(){
        System.out.println("2.Type book number to check out book (E.g  Type (1) for \"I Was Told There'd Be Cake\") ");
        InputToContinue = "yes";
        return InputToContinue;
    }

    public void executeOption(String optionChoice){

        optionSelected = optionChoice;

        switch(optionSelected){
            case "books":
                System.out.println("");
                System.out.println("Here is a list of books available for rent:");
                library.printCurrentBookCollection();
                this.optionMenu2();
                break;

            case "back":
                InputToContinue = "yes";
                this.optionMenu1();
                break;

            case "out":
                System.out.println("");
                library.printCurrentBookCollection();
                System.out.println("Please type the book number you wish to check out");
                InputToContinue = "no";
                break;

            case "quit":
                System.exit(0);
                break;

            default:
                System.out.println("");
                System.out.println("Select a valid option!");
                this.optionMenu1();
        }
    }
    }
