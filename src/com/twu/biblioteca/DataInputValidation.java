package com.twu.biblioteca;

public class DataInputValidation {

    public boolean validateStringDataInput(String input){

        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex ){
            return true;
        }
        return false;
    }

    public boolean validateNumericDataInput(String input){

        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex ){
            return false;
        }
        return true;
    }


}
