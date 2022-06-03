package com.example.springboot.persistence.entities;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    Long id;
    
    @Getter @Setter String name;

}
