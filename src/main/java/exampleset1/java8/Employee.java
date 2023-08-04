package com.java8;

public class Employee {

    private String name;
    private double salary;
    private String department;
    private int empId;

    public Employee(String name, double salary, String department, int empId){
        this.name = name;
        this.salary = salary;
        this.department = department;
        this.empId = empId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
}
