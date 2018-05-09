package com.twu.biblioteca;
import java.util.List;
import java.util.ArrayList;

public class ListOfBooks {

    String bookTitle = "";
    String authorName = "";
    String yearPublished = "";
    int bookNumber;
    List<ListOfBooks> bookList;


    public ListOfBooks(){
        this.currentBookCollection();
    }

    public ListOfBooks(int bookOrder, String title, String author, String year) {
        bookNumber = bookOrder;
        bookTitle = title;
        authorName = author;
        yearPublished = year;

    }

    public List<ListOfBooks> currentBookCollection(){

        bookList = new ArrayList<>();

        ListOfBooks bookList1 = new ListOfBooks(1, "Sloane Crosley", "2008");
        ListOfBooks bookList2 = new ListOfBooks(2,"Do Androids Dream of Electric Sheep?", "Philip K. Dick", "1996");
        ListOfBooks bookList3 = new ListOfBooks(3,"The Hitchhiker's Guide to the Galaxy", "Douglas Adams  ", "2017");
        ListOfBooks bookList4 = new ListOfBooks(4,"The Hollow Chocolate Bunnies of the Apocalypse", "Robert Rankin", "2003");
        ListOfBooks bookList5 = new ListOfBooks(5,"To Kill a Mockingbird", "Harper Lee", "2006");

    bookList.add(bookList1);
    bookList.add(bookList2);
    bookList.add(bookList3);
    bookList.add(bookList4);
    bookList.add(bookList5);

    return bookList;
    };

    public List<ListOfBooks> printCurrentBookCollection(){

        System.out.println("  ==============================================================");
        System.out.println("  BOOK TITLE                                                  ");
        System.out.println("  AUTHOR | YEAR PUBLISHED                                      ");
        System.out.println("  ==============================================================");

        for (int i = 0 ; i < bookList.size(); i++) {

            System.out.println("");
            System.out.println("  " + bookList.get(i).bookNumber + ". " + bookList.get(i).bookTitle);
            System.out.println("    By " + bookList.get(i).authorName + " | " + bookList.get(i).yearPublished);
            System.out.println("  ______________________________________________________________");
        }
        System.out.println("");
        return bookList;
    }

}
