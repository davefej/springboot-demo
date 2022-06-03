package com.example.springboot.persistence.entities;

import java.util.List;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    @Getter @Setter String name;

    @ManyToMany(targetEntity = Author.class)
    @Getter @Setter List<Author> authors;

    @ElementCollection
    @Getter @Setter List<Integer> ratings;

}