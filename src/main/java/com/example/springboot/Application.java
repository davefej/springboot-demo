package com.example.springboot;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.springboot.features.author.AuthorRepository;
import com.example.springboot.features.book.BookRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx, BookRepository bookRepo,AuthorRepository authorRepo) {
		return args -> {
			System.out.println("Libary is UP");
		};
	}

}
