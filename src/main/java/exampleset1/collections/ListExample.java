package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListExample {

    public static void main(String args[]){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("Ram","T100", "IT", 50000));
        employees.add(new Employee("Dev","T101", "Admin", 55000));
        employees.add(new Employee("Sham","T102", "IT", 60000));
        employees.add(new Employee("Maya","T103", "IT", 45000));
        employees.add(new Employee("Kashi","T104", "Admin", 65000));
        employees.add(new Employee("Abhi","T105", "HR", 70000));
        employees.add(new Employee(null,null, null, 0));
        employees.add(null);
        employees.add(null);
        employees.add(null);

        System.out.println(employees.size());
        System.out.println(employees.isEmpty());

       // System.out.println(employees);
        System.out.println("***************************************");
        System.out.println("Below is using iterator");

        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("***************************************");
        System.out.println("Below is from LinkedList");

        employees = new LinkedList<>();

        employees.add(new Employee("Param","T110", "HR", 45000));
        employees.add(new Employee("Utsav","T111", "Admin", 55000));
        employees.add(new Employee("Lok","T112", "IT", 65000));
        employees.add(new Employee("Sanjay","T113", "HR", 45000));
        employees.add(new Employee("Karan","T114", "IT", 75000));
        employees.add(new Employee("Anjan","T115", "HR", 85000));

        System.out.println(employees);

        System.out.println("***************************************");
        System.out.println("Below is from Vector");
        employees = new Vector<>();

        employees.add(new Employee("Karan","T114", "IT", 75000));
        employees.add(new Employee("Anjan","T115", "HR", 85000));
        employees.add(new Employee("Param","T110", "HR", 45000));
        employees.add(new Employee("Utsav","T111", "Admin", 55000));
        employees.add(new Employee("Lok","T112", "IT", 65000));
        employees.add(new Employee("Sanjay","T113", "HR", 45000));

        System.out.println(employees);

        System.out.println("***************************************");
        System.out.println("Below is from Stack");

        Stack<Employee> emps = new Stack<>();
        emps.push(new Employee("Karan","T114", "IT", 75000));
        emps.push(new Employee("Anjan","T115", "HR", 85000));
        emps.push(new Employee("Lok","T112", "IT", 65000));
        emps.push(new Employee("Sanjay","T113", "HR", 45000));
        emps.push(new Employee("Sanjay","T113", "HR", 45000));
        emps.push(new Employee("Param","T110", "HR", 45000));
        emps.push(new Employee("Utsav","T111", "Admin", 55000));
        // LIFO


        System.out.println(emps.peek());
        System.out.println(emps.pop());
        System.out.println(emps.peek());

    }
}
