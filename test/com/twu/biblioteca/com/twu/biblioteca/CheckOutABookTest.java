package com.twu.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class CheckOutABookTest {

    @Test
    void CheckCurrentBookCollectionDecrementsBy1() {
        ListOfBooks books = new ListOfBooks();
        List bookList = books.bookList;

        System.out.println(bookList);
        CheckOutABook test = new CheckOutABook(books);
        List<ListOfBooks> result = test.checkOutABook(3);
        System.out.println(bookList.size());
        assertEquals(4, result.size());
    }
}