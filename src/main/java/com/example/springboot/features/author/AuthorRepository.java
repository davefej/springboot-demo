package com.example.springboot.features.author;

import org.springframework.data.repository.ListCrudRepository;

public interface AuthorRepository extends ListCrudRepository<Author,Long>{

    Author findById(long id);
}
