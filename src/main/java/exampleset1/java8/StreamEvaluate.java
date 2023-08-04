package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEvaluate {
    public static void main(String args[]){

        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("ABC", 15000, "ITTech",101));
        employees.add(new Employee("GbA", 35000, "ITResearch",105));
        employees.add(new Employee("CaV", 50000, "HR",106));
        employees.add(new Employee("BcA", 75000, "BackIT",107));

        // get the sum of employee salary using stream api
       double sumOfSal = employees.stream()
                .mapToDouble(value -> value.getSalary())
                .sum();

       System.out.println(sumOfSal);

       //get the average of salary from employees

        double avgOfSal = employees.stream()
                .mapToDouble(value -> value.getSalary())
                .average()
                .getAsDouble();

        System.out.println(avgOfSal);

        // filter emp based on dept ITTech
        List<Employee> deptABCEmp = employees.stream()
                .filter(employee -> employee.getDepartment().equals("ITTech"))
                .collect(Collectors.toList());

        System.out.println(deptABCEmp.size());
    }
}
