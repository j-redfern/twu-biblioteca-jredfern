package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UserValidationTest {

    @Test
    void validatingDataInput(){
        UserValidation user = new UserValidation();

        boolean validate = user.validateUser("customer");
        assertEquals(true, validate);

        boolean invalidValidate = user.validateUser("1");
        assertEquals(false, invalidValidate);
    }
}