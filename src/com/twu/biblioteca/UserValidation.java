package com.twu.biblioteca;

public class UserValidation {
    public boolean validateUser(String input){

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
