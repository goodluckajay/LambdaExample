package com.self;

import java.util.List;

public class Main{

    public static void main(String[] args) {

        // implementation of lambda expression
        MyFunctionalInterface i = ()-> System.out.println("1000");

        i.getAmount();

        System.out.println( new BookService().getBooksInSort());

    }


}

@FunctionalInterface
interface MySampleFunctionalInterface {

    void getAmount();

    default String getName(){
        return "";
    }

    static void getCreditLimit(){
        return;
    }

}
