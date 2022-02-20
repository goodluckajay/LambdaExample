package com.self.comsumer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ComsumerDemo {
    public static  void main(String args[])
    {
        Consumer consumer = (t) -> System.out.println("Consumed... " + t);

        consumer.accept(121);


        List<Integer> list = Arrays.asList(1,3,8,2,7,4,9,6);
        list.forEach(list1-> System.out.println(list1));
        System.out.println("-------------------");
        list.stream().forEach(consumer);


    }
}
