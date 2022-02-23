package com.self.comsumer;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierDemo {

    public static void main(String[] args){

        Supplier<String> supplier = () -> "Im supplier" ; // Its supplier of String

        Supplier<Integer> supplierOfInteger = () -> 100 ;  // Its supplier of Integer
        //System.out.println(supplier.get());

        List<String> list = Arrays.asList("a", "b", "c");
        System.out.println(list.stream().findAny().orElseGet(supplier));

    }
}
