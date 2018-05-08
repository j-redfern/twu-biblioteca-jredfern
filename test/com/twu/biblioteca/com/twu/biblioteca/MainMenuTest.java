package com.twu.biblioteca;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainMenuTest {
    @Test
    void checkExecuteOptionMethodWorks(){
        ListOfBooks list = new ListOfBooks();
        String optionChoice = "books";
        MainMenu test = new MainMenu(list);
        test.executeOption(optionChoice);
        assertEquals("yes",test.validOptionInput);

        ListOfBooks newList = new ListOfBooks();
        String invalidOptionChoice = "hello";
        MainMenu newTest = new MainMenu(newList);
        newTest.executeOption(invalidOptionChoice);
        assertEquals("no",newTest.validOptionInput);
    }
}