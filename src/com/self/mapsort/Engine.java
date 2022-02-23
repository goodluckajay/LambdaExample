package com.self.mapsort;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

// Good example
public class Engine {
    public  static void main(String... args){
        Map<String, Integer> map = new HashMap<>();
        map.putIfAbsent("eight", 8);
        map.putIfAbsent("four", 4);
        map.putIfAbsent("ten", 2);
        map.putIfAbsent("six", 6);
        // sort the map by keys using stream
        map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.print(x.getValue() + " "));
        // sort the map by values using stream
        map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(x -> System.out.print(x.getKey() + " "));

        // Another example if KEY is CustomObject
        Map<Employee, Integer> employeeMap = new TreeMap<>((o1,o2) -> (int) (o2.getSalary() - o1.getSalary()));
        employeeMap.putIfAbsent(new Employee(176,"Ajay", "IT", 6000), 60);
        employeeMap.putIfAbsent(new Employee(177,"Ekta", "Home", 7000), 70);
        employeeMap.putIfAbsent(new Employee(178,"Dhiman", "Testing", 8000), 80);
        employeeMap.putIfAbsent(new Employee(179,"Sharma", "Business", 9000), 90);
        System.out.println("----------------------------");
        employeeMap.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept))).forEach(x -> System.out.println(x.getValue()));

    }
}
