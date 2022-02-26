package com.self.bifunction;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// print the distinct numbers from 2 lists
public class BiFunctaionDemo1 implements  BiFunction<List<Integer>, List<Integer>, List<Integer>>{

    static  List<Integer> l1 = Arrays.asList(1,2,3,4,5,6);
    static List<Integer> l2 = Arrays.asList(2,3,5,9,0);

    public static void main(String... args){
        BiFunctaionDemo1 obj = new BiFunctaionDemo1();
        System.out.println(obj.apply(l1,l2));

    }

    @Override
    public List<Integer> apply(List<Integer> l1, List<Integer> l2) {
        return Stream.of(l1, l2).flatMap(List::stream).distinct().collect(Collectors.toList());
    }
}
