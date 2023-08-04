package com.collections;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

    public static void main(String args[]){

       /* Set<Integer> integers = new HashSet<>();

        integers.add(10);
        integers.add(12);
        integers.add(15);
        integers.add(14);
        integers.add(10);
        integers.add(9);
        integers.add(7);

        System.out.println(integers);*/

        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee("Ram","T100", "IT", 50000));
        employees.add(new Employee("Dev","T101", "Admin", 55000));
        employees.add(new Employee("Sham","T102", "IT", 60000));
        employees.add(new Employee("Maya","T103", "IT", 45000));
        employees.add(new Employee("Kashi","T104", "Admin", 65000));
        employees.add(new Employee("Abhi","T105", "HR", 70000));
        employees.add(new Employee("Abhi","T105", "HR", 70000));
        employees.add(new Employee(null,null, null, 1000));



        //System.out.println(employees.contains(new Employee("Kashi","T120", "Admin", 65000.0)));
       /* Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }*/

        Set<Employee> employees1 = new TreeSet<>();
        employees1.add(new Employee("Ram","T100", "IT", 50000));
        employees1.add(new Employee("Dev","T101", "Admin", 55000));
        employees1.add(new Employee("Sham","T102", "IT", 60000));
        employees1.add(new Employee("Maya","T103", "IT", 45000));
        employees1.add(new Employee("Kashi","T104", "Admin", 65000));
        employees1.add(new Employee("Abhi","T105", "HR", 70000));
        employees1.add(new Employee("Abhi","T105", "HR", 70000));
        employees1.add(new Employee(null,null, null, 0));
        //employees1.add(null); // doen'e accept null values
        //employees1.add(null); // doen'e accept null values

        Iterator<Employee> itrt = employees1.iterator();

        while (itrt.hasNext()){
            System.out.println(itrt.next());
        }

    }
}
