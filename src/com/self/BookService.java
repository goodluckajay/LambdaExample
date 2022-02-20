package com.self;

import java.util.Collections;
import java.util.List;

public class BookService {

    public List<Book> getBooksInSort(){
        List<Book> listofBooks = new BookDAO().getBooks();
        Collections.sort(listofBooks, (obj1, obj2) -> obj1.getName().compareTo(obj2.getName()));
        return listofBooks;
    }

    public static  void main(String... args){
        List<Book> list = new BookService().getBooksInSort();

        for (Book book : list){
            System.out.println(book.getName());
        }

    }
}
