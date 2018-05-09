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
        assertEquals("yes",test.InputToContinue);

        ListOfBooks list1 = new ListOfBooks();
        String optionChoice1 = "quit";
        MainMenu test1 = new MainMenu(list1);
        test1.executeOption(optionChoice1);
        assertEquals("quit",test1.InputToContinue);

        ListOfBooks list2 = new ListOfBooks();
        String invalidOptionChoice = "out";
        MainMenu test2 = new MainMenu(list2);
        test2.executeOption(invalidOptionChoice);
        assertEquals("no",test2.InputToContinue);

        ListOfBooks list3 = new ListOfBooks();
        String optionChoice3 = "back";
        MainMenu test3 = new MainMenu(list3);
        test3.executeOption(optionChoice3);
        assertEquals("yes",test3.InputToContinue);

        ListOfBooks list4 = new ListOfBooks();
        String optionChoice4 = "out";
        MainMenu test4 = new MainMenu(list4);
        test4.executeOption(optionChoice4);
        assertEquals("no", test4.InputToContinue);

    }
}