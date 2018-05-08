package com.twu.biblioteca;
import java.util.List;
import java.util.ArrayList;


public class ListOfBooks {

    String bookTitle = "";
    String authorName = "";
    String yearPublished = "";
    List<ListOfBooks> bookList;

    public ListOfBooks(){

    }

    public ListOfBooks(String title, String author, String year) {
    bookTitle = title;
    authorName = author;
    yearPublished = year;
    }

    public List<ListOfBooks> currentBookCollection(){

        List<ListOfBooks> bookList = new ArrayList<ListOfBooks>();

        ListOfBooks bookList1 = new ListOfBooks("I Was Told There'd Be Cake", "Sloane Crosley", "2008");
        ListOfBooks bookList2 = new ListOfBooks("Do Androids Dream of Electric Sheep?", "Philip K. Dick", "1996");
        ListOfBooks bookList3 = new ListOfBooks("The Hitchhiker's Guide to the Galaxy", "Douglas Adams  ", "2017");
        ListOfBooks bookList4 = new ListOfBooks("The Hollow Chocolate Bunnies of the Apocalypse", "Robert Rankin", "2003");
        ListOfBooks bookList5 = new ListOfBooks("To Kill a Mockingbird", "Harper Lee", "2006");

    bookList.add(bookList1);
    bookList.add(bookList2);
    bookList.add(bookList3);
    bookList.add(bookList4);
    bookList.add(bookList5);

    return bookList;
    };


}
