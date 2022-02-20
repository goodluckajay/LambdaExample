package com.self.stream.api;

import java.util.List;
import java.util.stream.Collectors;

public class TestApi {
    public static void main(String... args){
        List<Employee> filteredListOfEmployees = new EmployeeDAO().getEmployees().stream().filter(emp->emp.getSalary() >=1500).collect(Collectors.toList());

       for (Employee e : filteredListOfEmployees)
           System.out.println(e.getName());
        System.out.println("----------------");
        List<Employee> list = getSalaryofEmployees("a");
        for(Employee e : list){
            System.out.println(e.getSalary());
        }
    }
    private static List<Employee> getSalaryofEmployees(String startName){

        List<Employee> filternedName = new EmployeeDAO().getEmployees().stream().filter(name -> name.getName().startsWith(startName)).collect(Collectors.toList());
        return  filternedName;
    }
}
