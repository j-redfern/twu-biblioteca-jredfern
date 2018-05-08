package com.twu.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ListOfBooksTest {
    @Test
    void checkBookCollectionExists(){
        ListOfBooks books = new ListOfBooks();
        List<ListOfBooks> listOfBooks = books.currentBookCollection();
        assertEquals("Do Androids Dream of Electric Sheep?", listOfBooks.get(1).bookTitle);
        assertEquals("Philip K. Dick", listOfBooks.get(1).authorName);
        assertEquals("1996", listOfBooks.get(1).yearPublished);
    }

    @Test
    void testPrintBookCollectionMethod(){
        ListOfBooks books = new ListOfBooks();
        List<ListOfBooks> result = books.printCurrentBookCollection();
        assertEquals("Do Androids Dream of Electric Sheep?", result.get(1).bookTitle);
        assertEquals("Philip K. Dick", result.get(1).authorName);
        assertEquals("1996", result.get(1).yearPublished);
    }
}
