package com.example.springboot;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import com.example.springboot.logic.Library;
import com.example.springboot.model.Book;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class BookController {
    
    @GetMapping("/books")
    public List<Book> getBooks() {
        return Library.getInstance().getBooks();
    }

    @GetMapping("/book")
    public Book getBook() {
        return Library.getInstance().getBooks().get(0);
    }

    @PostMapping("/book")
    public String getBook(Book b) {
        Library.getInstance().getBooks().add(b);
        return "OK";
    }
    
}
