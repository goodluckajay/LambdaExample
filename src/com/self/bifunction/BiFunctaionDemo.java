package com.self.bifunction;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;

public class BiFunctaionDemo {

        public static void main(String... args){
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("ajay", 5000);
        map.putIfAbsent("dhiman", 6000);
        map.putIfAbsent("ekta", 7000);
        map.putIfAbsent("sharma", 8000);

        BiFunction<String, Integer, Integer> biFunction = new BiFunction<String, Integer, Integer>() {
            @Override
            public Integer apply(String s, Integer v) {
                return v+1000;
            }
        };

        map.replaceAll(biFunction);
        System.out.println(map);

    }
}
