package com.self.mapreduce;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeDB {

    public static List<Employee> getAllEmployee(){
        return Stream.of
                (
                    new Employee(1, "ajay", "C", 2000.21),
                    new Employee(2, "ekta", "A", 3000.51),
                    new Employee(3, "dhiman", "B", 4000.98),
                    new Employee(4, "sharma", "B", 8000.67)
                ).collect(Collectors.toList());
    }
}
