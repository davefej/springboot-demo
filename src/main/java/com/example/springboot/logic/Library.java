package com.example.springboot.logic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.springboot.logic.model.Book;

@Service
public class Library {

    private List<Book> books;
    
    private Library(){
        books = new ArrayList<Book>();
        var b = new Book();
        b.setName("Egri csillagok");
        books.add(b);
        var b2 = new Book();
        b2.setName("Kőszívű ember fiai");
        books.add(b2);
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    
}