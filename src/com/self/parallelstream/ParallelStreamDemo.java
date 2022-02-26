package com.self.parallelstream;

import java.util.stream.IntStream;

public class ParallelStreamDemo {

    public  static void main(String... arg){
        long start = 0;
        long end = 0;
        start  =System.currentTimeMillis();
        IntStream.range(1,100).forEach(x -> System.out.print(x + ","));
        end = System.currentTimeMillis();
        long difference = end-start;
        System.out.println("difference with single core : " + difference);

        System.out.println("---------------- using parallel Stream -------------");
        difference = 0;
        start = start  =System.currentTimeMillis();
        IntStream.range(1,100).parallel().forEach(x -> System.out.print(x + ","));
        end = System.currentTimeMillis();
        difference = end-start;
        System.out.println("difference with multiple core: " + difference);
    }
}
