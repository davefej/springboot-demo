package com.example.springboot.logic;

import java.util.ArrayList;
import java.util.List;

import com.example.springboot.model.Book;

public class Library {

    private List<Book> books;
    static Library l;

    private Library(){
        books = new ArrayList<Book>();
        var b = new Book();
        b.setName("Egri csillagok");
        books.add(b);
        var b2 = new Book();
        b2.setName("Kőszívű ember fiai");
        books.add(b2);
    }

    public static Library getInstance(){
        if(l == null){
            l = new Library();
        }
        return l;
    }


    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    
}