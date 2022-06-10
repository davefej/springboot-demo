package com.example.springboot.features.book;

import java.util.List;

import org.springframework.data.repository.ListCrudRepository;

public interface BookRepository extends ListCrudRepository<Book,Long>{
    
    List<Book> findByName(String name);     

    Book findById(long id);

    List<Book> findBookAboveRating(Double minRating);

    List<Book> findBookAboveRatingNative(Double minRating);
}