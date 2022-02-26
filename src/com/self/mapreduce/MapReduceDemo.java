package com.self.mapreduce;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

// Ways to add the numbers in list
public class MapReduceDemo {
    public static void main(String... args){
        List<Integer> list = Arrays.asList(2,3,4,5);

        // Fist way to add the numbers in list
        int totalSum = list.stream().mapToInt(x->x).sum();
        System.out.println(totalSum);
        // Another way to add the numbers in list
        int reduceSum = list.stream().reduce(0, (a,b) -> a+b );
        System.out.println(reduceSum);
        // using method reference
        Optional<Integer> optionalSum = list.stream().reduce(Integer::sum);  // we can do similar for multiplication
        if (optionalSum.isPresent())
            System.out.println(optionalSum.get());

        // find the max value in stream
        int maxValue = list.stream().reduce(0, (x,y) -> x>y?x:y);
        System.out.println(maxValue);

        List<String> listOfLanguages = Arrays.asList("Java", "Phython", "C++", "database", ".net");

        Optional<String> longest = listOfLanguages.stream().reduce((x,y)-> x.length() > y.length() ? x : y);
        System.out.println(longest.get());

    }
}
