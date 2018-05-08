package com.twu.biblioteca;

import org.junit.jupiter.api.Test ;

import static org.junit.jupiter.api.Assertions.*;

class DataInputValidationTest {

    @Test
    void validatingUserDataInput(){
        DataInputValidation user = new DataInputValidation();

        boolean validate = user.validateDataInput("customer");
        assertEquals(true, validate);

        boolean invalidValidate = user.validateDataInput("1");
        assertEquals(false, invalidValidate);
    }

    @Test
    void  validatingMainMenuDataInput(){
        DataInputValidation mainMenu = new DataInputValidation();

        boolean validate = mainMenu.validateDataInput("books");
        assertEquals(true, validate);

        boolean invalidValidate = mainMenu.validateDataInput("1");
        assertEquals(false, invalidValidate);

    }
}