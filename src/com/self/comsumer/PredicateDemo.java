package com.self.comsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo {
    public static void main(String... args){

        Predicate<Integer> predicate = (i -> (i%2 == 0 ?true :false));

        List<Integer> list = Arrays.asList(1,2,3,4,5,6);
        list.stream().filter(predicate).forEach(l -> System.out.println(l));
    }
}
