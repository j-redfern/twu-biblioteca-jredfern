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

        DataInputValidation userInput = new DataInputValidation();
        boolean userInputValidate = userInput.validateStringDataInput(line);

        if(userInputValidate){

            ListOfBooks books = new ListOfBooks();
            MainMenu menuOption = new MainMenu(books);

            if(line.contains("customer")) {

                String inputToContinue = "";

                menuOption.optionMenu1();
                inputToContinue = menuOption.InputToContinue;

                DataInputValidation mainMenuInput = new DataInputValidation();


                while (inputToContinue == "yes") {

                    input.hasNext();
                    String lineTwo = input.nextLine().toLowerCase();

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
                boolean InputValidate = checkoutInput.validateNumericDataInput(lineThree);

                CheckOutABook checkOut = new CheckOutABook(books);

                inputToContinue = "yes";

                while (inputToContinue != null) {

                    if (inputToContinue == "yes") {
                        if (InputValidate) {
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
                            checkOut.checkOutABook(Integer.parseInt(bookNumberInput));
                            inputToContinue = checkOut.checkOutMenu;

                        } else {
                            System.out.print("Invalid input. Try again");
                            System.exit(0);
                        }
                    }

                    if(inputToContinue == "backAfterCheckout"){
                        menuOption.executeOption(inputToContinue);

                        input.hasNext();
                        String optionInput = input.nextLine().toLowerCase();

                        DataInputValidation optionDataInput = new DataInputValidation();
                        boolean optionDataInputValidate = optionDataInput.validateStringDataInput(optionInput);

                        if (optionDataInputValidate) {
                            menuOption.executeOption(optionInput);
                            inputToContinue = menuOption.InputToContinue;
                        }
                        else {
                            inputToContinue = "backAfterCheckout";
                            System.out.println("Select a valid option");

                        }
                    }

                    if(inputToContinue == "return"){

                        input.hasNext();
                        String returnInput = input.nextLine();

                        DataInputValidation returnDataInput = new DataInputValidation();
                        boolean returnDataInputValidate = returnDataInput.validateNumericDataInput(returnInput);

                        if(returnDataInputValidate){
                            ReturnBook returnbook = new ReturnBook(checkOut);
                            returnbook.returnABook(Integer.parseInt(returnInput));
                            inputToContinue = checkOut.checkOutMenu;

                        }
                        else {
                            System.out.println("Select a valid option");
                            inputToContinue = "return";
                            menuOption.executeOption(inputToContinue);
                        }
                    }

                    if(inputToContinue == "backAfterReturn"){
                        menuOption.executeOption(inputToContinue);

                        input.hasNext();
                        String optionInput = input.nextLine().toLowerCase();

                        DataInputValidation optionDataInput = new DataInputValidation();
                        boolean optionDataInputValidate = optionDataInput.validateStringDataInput(optionInput);

                        if (optionDataInputValidate) {
                            menuOption.executeOption(optionInput);
                            inputToContinue = menuOption.InputToContinue;
                        }
                        else {
                            inputToContinue = "backAfterReturn";
                            System.out.println("Select a valid option");

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