package com.example.springboot.api.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.context.request.NativeWebRequest;

import com.example.springboot.api.api.BooksApi;
import com.example.springboot.model.book.Book;
import com.example.springboot.shared.services.Library;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class BookController implements BooksApi{
    
    @Autowired
    Library library;

    @Autowired
    NativeWebRequest request;
    /* 
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
    }*/

    @GetMapping("/apitest")
    public Object apiTest(){
        final String uri = "http://echo.jsontest.com/key/value/one/two";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(uri, Object.class);        
    }

    @Override
    public ResponseEntity<Book> createRandomBook() {
        // TODO Auto-generated method stub
        return BooksApi.super.createRandomBook();
    }

    @Override
    public ResponseEntity<Book> getBook(Long id) {
        // TODO Auto-generated method stub
        return BooksApi.super.getBook(id);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        // TODO Auto-generated method stub
        return BooksApi.super.getBooks();
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.of(request);
    }

    @Override
    public ResponseEntity<List<Book>> topRatedBooks(Double rating) {
        // TODO Auto-generated method stub
        return BooksApi.super.topRatedBooks(rating);
    }

 
    
}
