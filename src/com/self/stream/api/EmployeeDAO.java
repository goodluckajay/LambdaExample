package com.self.stream.api;

import java.util.Arrays;
import java.util.List;

public class EmployeeDAO {

    List<Employee> getEmployees(){

        List<Employee> emp = Arrays.asList(new Employee(1,"ajay", "dev", 1000),
                                            new Employee(2,"dhiman", "testing", 2000),
                                            new Employee(3,"ekta", "document", 1500),
                                            new Employee(1,"sharma", "analyst", 2500)
                                        );

        return  emp;
    }
}
