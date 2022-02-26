package com.self.optional;


import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static void main(String... args) throws Exception {

        Resource resource = new Resource(100, "ajay", "ajay.dhiman1@wipro.com", Arrays.asList("12345", "678900"));

        // First way to create object of Optional class
        Optional<Object> emptyOptional = Optional.empty();
        System.out.println(emptyOptional);
        // Second way to create object of Optional class
            //Optional<String> resourceEmail = Optional.of(resource.getEmail());   // if email field is null in Resource Object
           // System.out.println(resourceEmail);

        // Third way to create object of Optional class
        Optional<String> resourceEmail1 = Optional.ofNullable(resource.getEmail());  // if email field is not null in Resource object
        if (resourceEmail1.isPresent())
        {
            System.out.println(resourceEmail1.get());
        };

        Resource resource1 = new Resource(100, "ajay", "present@present.com", Arrays.asList("12345", "678900"));
        Optional <String> defaultValue = Optional.ofNullable(resource1.getEmail());
        System.out.println(defaultValue.orElse("default@default.com"));

        Resource resource2 = new Resource(100, "ajay", null, Arrays.asList("12345", "678900"));
        Optional <String> defaultValue2 = Optional.ofNullable(resource2.getEmail());
        System.out.println(defaultValue2.orElse("default@default.com"));

        Resource resource3 = new Resource(100, "ajay", null, Arrays.asList("12345", "678900"));
        Optional <String> defaultValue3 = Optional.ofNullable(resource3.getEmail());
        System.out.println(defaultValue2.orElseThrow(() -> new IllegalArgumentException("email not present")));

        getAllResourcesByEmailId("sample@sample.com");


    }

    public static Resource getAllResourcesByEmailId(String email) throws  Exception{
        List<Resource> list = ResourceDB.getAllResource();

        Resource resource = list.stream()
                .filter(x -> x.getEmail().equals(email))
                .findAny()
                .orElseThrow(() -> new Exception(""));
        return resource;


    }
}
