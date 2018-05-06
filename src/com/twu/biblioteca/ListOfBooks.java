package com.twu.biblioteca;

import java.util.List;
import java.util.ArrayList;

import java.util.Arrays;

public class ListOfBooks {

List<String> bookList = new ArrayList<String> (Arrays.asList("I Was Told There'd Be Cake","Do Androids Dream of Electric Sheep?","The Hitchhiker's Guide to the Galaxy"));

    public List<String> getBookList() {
        for(int i = 0 ; i < bookList.size(); i++) {
            System.out.println(bookList.get(i));
        }
        return bookList;
    }

}
