package com.self.exceptionhandling;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ExceptionHandlingDemo {
    public static void main(String... args){
        // if this is the list of String and you wana to print it using stream then it will throw an exception at line 11
        List<String> list = Arrays.asList("1000", "2000", "XYZ", "4000");

       //list.forEach(x-> System.out.println(Integer.parseInt(x))); // commented only to execute rest of the program
        // one way to handle it :-
                list.forEach(x-> {
                                    try{
                                        System.out.println(Integer.parseInt(x));
                                    }catch (NumberFormatException nfex){
                                        System.out.println(nfex.getMessage());
                                    }

                                 });

        // 2nd way to handle the excepiton is
        list.forEach(x-> printList(x));
        System.out.println("3rd value to handle exception");
        // 3rd and correct way to implement

        thisMethodTakesAndReturnConsumerObject(s-> System.out.println(Integer.parseInt(s)));
    }

    public static void printList(String s){
        try{
            System.out.println(Integer.parseInt(s));
        }catch (NumberFormatException nfex){
            System.out.println(nfex.getMessage());
        }
    }

    public static Consumer<String> thisMethodTakesAndReturnConsumerObject(Consumer<String> payload){
        return
                    obj -> {
                                try
                                {
                                    payload.accept(obj);
                                    System.out.println(payload);
                                }catch (NumberFormatException nfex)
                                {
                                    System.out.println(nfex.getMessage());
                                }
                             };
    }
}
