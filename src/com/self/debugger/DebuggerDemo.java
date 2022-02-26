
package com.self.debugger;

import com.self.mapreduce.EmployeeDB;

import java.util.List;
import java.util.stream.Collectors;

public class DebuggerDemo {
    public static void main(String... args){

        List<String> name = EmployeeDB.getAllEmployee()
                .stream()
                .filter(x->x.getSalary()>500)
                .map(x->x.getName())
                .distinct()
                .sorted()
                .skip(0)
                .limit(3)
                .collect(Collectors.toList());
        System.out.println(name);
    }
}
