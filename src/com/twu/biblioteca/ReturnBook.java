package com.twu.biblioteca;

import java.util.List;

public class ReturnBook {

    public int bookNumber;
    public CheckOutABook newLibrary;
    public ListOfBooks originalLibraryList;
    public int bookNumberReturned;

    public ReturnBook(CheckOutABook bookCollection) {
        newLibrary = bookCollection;
    }

    public List<ListOfBooks> returnABook (int bookNumberInput){
        bookNumber = bookNumberInput;

        boolean containsBook = false;

        for (ListOfBooks library: originalLibraryList.bookList) {
            if (bookNumber == library.bookNumber) {
                containsBook = true;
            }
        }

        if(containsBook){
            for(int i = 0; i < bookNumber; i++){
                if (newLibrary.library.bookList.get(i).bookNumber != (bookNumber)) {
                    newLibrary.library.bookList.add(originalLibraryList.bookList.get(i));
                    System.out.println("");
                    System.out.println("Thank you for returning the book!");
                    System.out.println(newLibrary.library.bookList);
                    newLibrary.checkOutMenu = "back";
                }
            }
        }
        else {
            System.out.println("");
            System.out.println("That is not a valid book to return");
            newLibrary.checkOutMenu = "return";

        }

        return newLibrary.library.bookList;
    }

}
