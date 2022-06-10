package com.example.springboot.shared.services;

import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springboot.features.author.Author;
import com.example.springboot.features.author.AuthorRepository;
import com.example.springboot.features.book.Book;
import com.example.springboot.features.book.BookRepository;

@Service
public class Library {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    AuthorRepository authorRepository;
    
    public List<Book> listBooks() {
        return bookRepository.findAll();        
    }

    public Book findBookById(Long id){
        return bookRepository.findById(id).orElse(null);
    }


    public List<Author> listAuthours(){
        return authorRepository.findAll();
    }

    public List<Book> listTopRatedBooks(Double minRating){
        if(new Random().nextBoolean())
            return bookRepository.findBookAboveRating(minRating);
        else    
            return bookRepository.findBookAboveRatingNative(minRating);
    }

    public Book newBook() {
        Book b = new Book();
        b.setName("randomName_"+new Date().getTime());
        bookRepository.save(b);       
        return b;
    }

    
}