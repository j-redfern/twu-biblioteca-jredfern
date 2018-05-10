package com.twu.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ReturnBookTest {
    @Test
    void CheckCurrentBookCollectionIncrementsBy1() {
        ListOfBooks books = new ListOfBooks();
        CheckOutABook checkoutAbook = new CheckOutABook(books);
        checkoutAbook.checkOutABook(3);
        ReturnBook test = new ReturnBook(checkoutAbook);
        CheckOutABook result = test.returnABook(3);
        assertEquals(5, result.library.bookList.size());
    }
}