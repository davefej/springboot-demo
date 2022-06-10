package com.example.springboot.features.book;

import java.util.List;

import org.hibernate.annotations.NamedQuery;

import com.example.springboot.features.author.Author;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@NamedQuery(name = "Book.findBookAboveRating",query = "from Book b WHERE :minRating < (SELECT AVG(r) from Book b2 JOIN b2.ratings r WHERE b2.id = b.id)")
@NamedNativeQuery(name = "Book.findBookAboveRatingNative",query = "SELECT * from BOOK WHERE :minRating < (SELECT AVG(ratings) FROM book_ratings WHERE book_ratings.book_id = book.id)",resultClass = Book.class)
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter Long id;
    
    @Getter @Setter String name;

    @ManyToMany(targetEntity = Author.class)
    @Getter @Setter List<Author> authors;

    @ElementCollection
    @CollectionTable(name = "book_ratings")
    @Getter @Setter List<Integer> ratings;

}