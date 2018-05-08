package com.twu.biblioteca;

public class DataInputValidation {

    public boolean validateDataInput(String input){

        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex ){
            return true;
        }
        return false;
    }
}
