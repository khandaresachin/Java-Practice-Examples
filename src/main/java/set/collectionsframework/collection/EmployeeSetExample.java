package batch2.collectionsframework.collection;

import batch2.collectionsframework.Employee;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class EmployeeSetExample {
    public static void main(String[] args) {
        Set<Employee> employees = new HashSet<>();

        employees.add(new Employee(100,"Dev", 10000, "Pune"));
        employees.add(new Employee(102,"Devaki", 20000, "Mumbai"));
        employees.add(new Employee(105,"Krish", 35000, "Nashik"));
        employees.add(new Employee(120,"Ram", 50000, "Patna"));
        employees.add(new Employee(150,"Seeta", 15000, "Delhi"));

        employees.add(new Employee(100,"Devansh", 12000, "Chennai")); // duplicate
        employees.add(new Employee(105,"Krishna", 31000, "Nagpur")); // duplicate

        employees.add(null);
        employees.add(null); // this will not be stored in hashset as it only allows one entry of null
        Iterator<Employee> itr = employees.iterator();

        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
