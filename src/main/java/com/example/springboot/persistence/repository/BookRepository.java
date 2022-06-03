package com.example.springboot.persistence.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.springboot.persistence.entities.Book;

public interface BookRepository extends CrudRepository<Book,Long>{
    
    List<Book> findByName(String name);

    Book findById(long id);
}