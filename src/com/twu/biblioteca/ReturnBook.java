package com.twu.biblioteca;

import java.util.List;

public class ReturnBook {

    public int bookNumber;
    public CheckOutABook newLibrary;
    public ListOfBooks originalLibraryList;

    public ReturnBook(CheckOutABook bookCollection) {
        newLibrary = bookCollection;
    }

    public CheckOutABook returnABook (int bookNumberInput){

        bookNumber = bookNumberInput;

        boolean containsBook = true;
        //if in original library
        // add to checkout library (& sort order)

//        for (ListOfBooks library: originalLibraryList.bookList) {
//            System.out.println("enter contain for loop");
//
//            if (library.bookNumber == bookNumber ) {
//                System.out.println(bookNumber);
//               containsBook = true;
//            }
//        }

     if(containsBook){
         ListOfBooks originalList = new ListOfBooks();
         originalLibraryList = originalList;

//if(bookNumber == 3){
// //           for(int i = 0; i < bookNumber; i++){
////if
//                if (newLibrary.library.bookList.get(bookNumber-1).bookNumber != bookNumber) {
//                    System.out.println("enter contain");
                   newLibrary.library.bookList.add(originalLibraryList.bookList.get(bookNumber - 1));
                    System.out.println("");
                    System.out.println("Thank you for returning the book!");
                    newLibrary.checkOutMenu = "backAfterReturn";

//                }
//            }
        }
        else {
            System.out.println("");
            System.out.println("That is not a valid book to return");
            newLibrary.checkOutMenu = "return";

        }

        return newLibrary;
    }

}
