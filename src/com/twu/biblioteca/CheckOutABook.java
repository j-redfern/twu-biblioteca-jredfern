package com.twu.biblioteca;

import java.util.List;
import org.junit.jupiter.api.Test ;

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
           System.out.println(containsBook);
           if(containsBook){
               for(int i = 0; i < bookNumber; i++){
                   if (library.bookList.get(i).bookNumber == (checkedOutBooks)) {
                       library.bookList.remove(i);
                       System.out.println("");
                       System.out.println("Thank you! Enjoy the book");
                   }
               }
            }
            else {
               System.out.println("");
               System.out.println("That book is not available");
               checkOutMenu = "yes";
             }

       return library.bookList;
   }
}
