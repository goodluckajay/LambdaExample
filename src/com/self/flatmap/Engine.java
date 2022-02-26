package com.self.flatmap;

import java.util.List;
import java.util.stream.Collectors;

public class Engine {

public static void main(String... args){
        List<Resource> list = ResourceDB.getAllResource();
        List<String> emails = list.stream().map(cust -> cust.getEmail()).collect(Collectors.toList());
        System.out.println(emails);

        List<List<String>> numbers = list.stream().map(mobile -> mobile.getMobile()).collect(Collectors.toList());
        System.out.println(numbers);

    System.out.println("============ usign flatmap ==================");
    List<String> flatList = list.stream()
                                .flatMap(s->s.getMobile().stream())
                                .collect(Collectors.toList());
    System.out.println(flatList);
    }
}
