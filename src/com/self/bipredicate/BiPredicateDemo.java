package com.self.bipredicate;

import java.util.function.BiPredicate;

// and() method of BiPredicate interface
public class BiPredicateDemo {

    public static void main(String... args){

        BiPredicate<String, String> biPredicate = (s1,s2) -> s1.length() == s2.length();
        BiPredicate<String, String> biPredicate1 = (s1,s2) -> s1.equals(s2);


        boolean result = biPredicate.and(biPredicate1).test("ajay", "ajay");
        System.out.println(result);
        System.out.println("---------------");
        BiPredicate<String, String> biPredicate2 = (s1,s2) -> s1.length() == s2.length();
        BiPredicate<String, String> biPredicate3 = (s1,s2) -> s1.equals(s2);
        boolean result1 = biPredicate3.or(biPredicate2).test("ajay", "ekta");
        System.out.println(result1);
    }
}
