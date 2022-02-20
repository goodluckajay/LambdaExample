package com.self;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getBooks(){

        List<Book> books = new ArrayList<>();

        books.add(new Book(100, "Java", 1000));
        books.add(new Book(200, ".NET", 2000));
        books.add(new Book(300, "DB", 3000));

        return books;

    }
}
