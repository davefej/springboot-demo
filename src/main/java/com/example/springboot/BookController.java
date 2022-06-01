package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

import com.example.springboot.model.Book;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController {
    
    @GetMapping("/books")
    public ArrayList<Book> getBooks() {
        var books = new ArrayList<Book>();
        var b = new Book();
        b.setName("Egri csillagok");
        books.add(b);
        var b2 = new Book();
        b2.setName("Kőszívű ember fiai");
        books.add(b2);
        return books;
    }
    
}
