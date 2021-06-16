package com.app.zad12coi.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Book {
    private String name;
    private String isbn;
    public static List<Book> books = new ArrayList<>();
}
