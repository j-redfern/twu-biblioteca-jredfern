package com.twu.biblioteca;

import java.util.List;

public class CheckOutABook {

   public ListOfBooks library;
   public int checkedOutBooks;
   public String checkOutMenu;

   public CheckOutABook(ListOfBooks books){
       library = books;
   }

   public List<ListOfBooks> checkOutABook (int bookNumber) {

       checkedOutBooks = bookNumber;

       boolean containsBook = false;

       for (ListOfBooks library: library.bookList) {
           if (library.bookNumber == checkedOutBooks) {
               containsBook = true;
           }
       }

       if(containsBook){
           for(int i = 0; i < bookNumber; i++){
               if (library.bookList.get(i).bookNumber == (checkedOutBooks)) {
                   library.bookList.remove(i);
                   System.out.println("");
                   System.out.println("Thank you! Enjoy the book");
                   checkOutMenu = "backAfterCheckout";
               }
           }
       }
       else {
           System.out.println("");
           System.out.println("That book is not available");
           checkOutMenu = "tryAgain";
           System.out.println("");
           System.out.println("Please type the book number you wish to check out");
       }

       return library.bookList;
   }
}
