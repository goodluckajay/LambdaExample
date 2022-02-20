package com.self;

@FunctionalInterface
public interface MyFunctionalInterface {

    void getAmount();


    default String getName(){
        return "";
    }

    static void getCreditLimit(){
        return;
    }

}
