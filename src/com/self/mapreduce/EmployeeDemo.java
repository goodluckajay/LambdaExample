package com.self.mapreduce;

import java.util.List;
import java.util.OptionalDouble;

public class EmployeeDemo {

    public  static void main(String... arg){
        List<Employee> employeeList = EmployeeDB.getAllEmployee();
        double averageSalraryOfAGradeEmployee = employeeList
                                                        .stream()
                                                        .filter(x->x.getGrade().equals("A"))
                                                        .map(x->x.getSalary())
                                                        .mapToDouble(i->i)
                                                        .average()
                                                        .getAsDouble();
        System.out.println(averageSalraryOfAGradeEmployee);

        double sum = employeeList
                        .stream()
                        .filter(x->x.getGrade().equals("B"))
                        .map(x->x.getSalary())
                        .mapToDouble(i->i)
                        .sum();
        System.out.println("sum of salary of all B grade employee is : "+ sum);
    }
}
