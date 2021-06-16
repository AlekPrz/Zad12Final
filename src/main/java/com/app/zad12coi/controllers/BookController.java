package com.app.zad12coi.controllers;


import com.app.zad12coi.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api")
public class BookController {


    @GetMapping("/books")
    public Collection<Book> findBooks() {
        return Book.books;
    }

    @GetMapping("/booksByName/{filter}")
    public Collection<Book> findBooksByName(@PathVariable String filter) {
        return Book.books.stream()
                .filter(p -> p.getName().toLowerCase().contains(filter.toLowerCase()))
                .collect(Collectors.toList());
    }

    @GetMapping("/booksByISBN/{filter}")
    public Collection<Book> findBooksByISBN(@PathVariable String filter) {
        System.out.println("First");
        return Book.books.stream()
                .filter(p -> p.getIsbn().equals(filter))
                .collect(Collectors.toList());
    }

}