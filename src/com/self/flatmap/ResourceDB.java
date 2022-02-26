package com.self.flatmap;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// Sample DB for testing
public class ResourceDB {

    public static List<Resource> getAllResource(){
        return  Stream.of(
                new Resource(100, "ajay", "ajay.dhiman1@wipro.co", Arrays.asList("9910443435", "1234567890")),
                new Resource(100, "ajay", "ektadhiman33@gmail.com", Arrays.asList("9910448939", "8218488571")),
                new Resource(100, "ajay", "goodlucajay@gmail.com", Arrays.asList("1111111111", "0000000000")),
                new Resource(100, "ajay", "ektasharma@gmail.com", Arrays.asList("2222222222", "3333333333"))
                ).collect(Collectors.toList());
    }

}
