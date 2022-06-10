package com.example.springboot.features.book;

import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.shared.services.Library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


@RestController
public class BookController {
    
    @Autowired
    Library library;

    @GetMapping("/books")
    public List<Book> getBooks() {
        return library.listBooks();
    }

    @GetMapping("/books/{id}")
    public Book getBook(@PathVariable Long id) {
        return library.findBookById(id);
    }

    @GetMapping("/books/ratingsAbove/{rating}")
    public List<Book> topRatedBooks(@PathVariable Double rating){
        return library.listTopRatedBooks(rating);
    }

    @GetMapping("/books/createRandom")
    public Book createRandomBook() {
        return library.newBook();        
    }
    
}
