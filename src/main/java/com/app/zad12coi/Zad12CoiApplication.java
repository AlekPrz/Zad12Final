package com.app.zad12coi;

import com.app.zad12coi.model.Book;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zad12CoiApplication {

    public static void main(String[] args) {
        Book.books.add(new Book("Harry Potter and the prisoner of azkaban","1234567890"));
        Book.books.add(new Book("Harry Potter and the cursed child","1122334455"));
        Book.books.add(new Book("Lord ef the rings","09876543231"));
        SpringApplication.run(Zad12CoiApplication.class, args);
    }

}
