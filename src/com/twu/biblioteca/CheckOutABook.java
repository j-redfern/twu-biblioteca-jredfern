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

   public List<ListOfBooks> checkOutABook (int bookNumber){

       checkedOutBooks = bookNumber;

      for(int i = 0 ; i < library.bookList.size(); i++){
            if(library.bookList.get(i).bookNumber == (checkedOutBooks)){
                library.bookList.remove(i);
            }
      }
       System.out.println("");
       System.out.println("Thank you! Enjoy the book");

       return library.bookList;
   }

}
