package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import java.util.List;

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

    @Test
    void printListOfBooks(){
        ListOfBooks books = new ListOfBooks();
        List<String> listOfBooks = books.getBookList();
        assertEquals("I Was Told There'd Be Cake", listOfBooks.get(0));
        assertEquals("Do Androids Dream of Electric Sheep?", listOfBooks.get(1));
        assertEquals("The Hitchhiker's Guide to the Galaxy", listOfBooks.get(2));
    }
}