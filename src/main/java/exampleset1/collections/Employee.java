package com.collections;

import java.util.Objects;

public class Employee implements Comparable<Employee> {

    private String name;
    private String empId;
    private String department;
    private int salary;

    public Employee(String name, String empId, String department, int salary) {
        this.name = name;
        this.empId = empId;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", empId='" + empId + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;
        Employee employee = (Employee) o;
        return empId.equals(employee.empId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(empId);
    }

    @Override
    public int compareTo(Employee o) {
        if (o == null){
            return 0;
        }
        if(o.salary == 0){
            return 0;
        }
        return this.salary - o.salary;
    }
}
