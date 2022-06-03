package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.springboot.logic.Library;
import com.example.springboot.logic.model.Book;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class BookController {
    
    @Autowired
    Library library;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return library.getBooks();
    }

    @GetMapping("/book")
    public Book getBook() {
        return library.getBooks().get(0);
    }

    @PostMapping("/book")
    public String getBook(Book b) {
        library.getBooks().add(b);
        return "OK";
    }
    
}
