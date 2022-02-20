package com.self.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEachDemo {
//Note : List having stream() api but map doesn't have stream api
    public static void main(String... args){
        List<String> list = new ArrayList<>();

        list.add("ajay");
        list.add("dhiman");
        list.add("ekta");
        list.add("sharma");

        // printing the elements of list using enhance for loop
        for(String s : list){
            System.out.println(s);
        }
        System.out.println("--------List printing using stream ----------");
        // printing the elements of list using forEach()
        list.stream().forEach(x -> System.out.println(list));

        System.out.println("------List printing using forEach ------------");
        list.forEach(s -> System.out.println(s));
        System.out.println("---------- using filter in stream -----------");
        list.stream().filter(x -> x.startsWith("d")).forEach(x -> System.out.println(x));

        System.out.println("--------MAP print ----------");
        Map<String, Integer> map = new HashMap<>();
        map.put("ajay", 40);
        map.put("ekta", 38);
        map.put("a",20);
        map.put("c",25);
        map.forEach((k,v) ->System.out.println(k + "=" + v));
        System.out.println("--------MAP print using entrySet's Stream api ----------");
        map.entrySet().stream().forEach(obj -> System.out.println(obj));
        System.out.println("------- printing map using filter -----------");
        map.entrySet().stream().filter(x->x.getKey().equals("ekta")).forEach(x-> System.out.println(x));
    }
}
