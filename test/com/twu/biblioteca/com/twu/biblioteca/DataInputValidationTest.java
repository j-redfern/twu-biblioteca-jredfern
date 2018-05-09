package com.twu.biblioteca;

import org.junit.jupiter.api.Test ;

import static org.junit.jupiter.api.Assertions.*;

class DataInputValidationTest {

    @Test
    void validatingUserDataInputIsString() {
        DataInputValidation user = new DataInputValidation();

        boolean validateStringInputForUser = user.validateStringDataInput("customer");
        assertEquals(true, validateStringInputForUser);

        boolean invalidValidate = user.validateStringDataInput("1");
        assertEquals(false, invalidValidate);
    }

    @Test
    void validatingMainMenuDataInputIsString() {
        DataInputValidation mainMenu = new DataInputValidation();

        boolean validate = mainMenu.validateStringDataInput("books");
        assertEquals(true, validate);

        boolean invalidValidate = mainMenu.validateStringDataInput("1");
        assertEquals(false, invalidValidate);

    }

    @Test
    void validatingCheckOutBookDataInputIsNumeric(){
        DataInputValidation checkOut = new DataInputValidation();

        boolean validate = checkOut.validateNumericDataInput("1");
        assertEquals(true, validate);

        boolean invalidValidate = checkOut.validateNumericDataInput("books");
        assertEquals(false, invalidValidate);
    }
}