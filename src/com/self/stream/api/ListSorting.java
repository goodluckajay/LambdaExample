package com.self.stream.api;

import sun.print.PSPrinterJob;

import java.util.*;

public class ListSorting {


    public static void main(String args[]){
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(2);
        list.add(8);
        list.add(4);
        list.add(9);
        list.add(7);

        sortListInAscendingOrder(list);
        sortListInDecendingOrder(list);
        sortListUsingStreamAscending(list);
        sortListUsingStreamDecending(list);

        sortEmployeeOnSalary();
    }
    // Ascending Order without Lambda and stream api
    private static void sortListInAscendingOrder(List<Integer> list) {

        Collections.sort(list);
        System.out.println(list);
    }
    // Descending Order without lambda and stream api
    private static void sortListInDecendingOrder(List<Integer> list) {

        Collections.reverse(list);
        System.out.println(list);
    }
    // Ascending order using Lambda and stream api
    private static void sortListUsingStreamAscending(List<Integer> list)
    {
        list.stream().sorted().forEach(x-> System.out.print(x+","));
    }
    // Descending order using Lambda and Stream api
    private static void sortListUsingStreamDecending(List<Integer> list) {
        System.out.println();
        list.stream().sorted(Comparator.reverseOrder()).forEach(x -> System.out.print(x + ","));
    }
    // Custom sorting using Lambda
    private static void sortEmployeeOnSalary(){
        System.out.println("");
        List<Employee> list = new EmployeeDAO().getEmployees();
        Collections.sort(list, (o1, o2) -> (int)(o1.getSalary()-o2.getSalary()));
       for(Employee e : list){
           System.out.println(e.getName());
       }
        System.out.println("Sorting using stream");
        // Custom sorting using Stream api
        List<Employee> list1 = new EmployeeDAO().getEmployees();
       //list1.stream().sorted((o1, o2) -> (int)(o2.getSalary()-o1.getSalary())).forEach(x -> System.out.println(x.getName())); //will also work
       list1.stream().sorted(Comparator.comparing(x->x.getSalary())).forEach(x -> System.out.println(x.getName()));

    }


}

