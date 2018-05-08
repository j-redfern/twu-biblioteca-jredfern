package com.twu.biblioteca;

import org.junit.jupiter.api.Test ;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.matchers.JUnitMatchers.*;


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
    void checkBookCollectionExists(){
        ListOfBooks books = new ListOfBooks();
        List<ListOfBooks> listOfBooks = books.currentBookCollection();
        assertEquals("Do Androids Dream of Electric Sheep?", listOfBooks.get(1).bookTitle);
        assertEquals("Philip K. Dick", listOfBooks.get(1).authorName);
        assertEquals("1996", listOfBooks.get(1).yearPublished);
    }
}