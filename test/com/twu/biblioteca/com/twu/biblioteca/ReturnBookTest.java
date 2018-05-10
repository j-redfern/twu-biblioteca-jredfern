package com.twu.biblioteca;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.List;

class ReturnBookTest {
    void CheckCurrentBookCollectionIncrementsBy1() {
        ListOfBooks books = new ListOfBooks();
        CheckOutABook checkoutAbook = new CheckOutABook(books);
        checkoutAbook.checkOutABook(3);
        ReturnBook test = new ReturnBook(checkoutAbook);
        List<ListOfBooks> result = test.returnABook(3);
        assertEquals(5, result.size());
    }
}