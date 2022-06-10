package com.example.springboot.features.author;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @Getter @Setter String name;

}
