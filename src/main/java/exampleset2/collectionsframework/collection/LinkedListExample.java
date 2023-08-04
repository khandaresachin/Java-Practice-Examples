package batch2.collectionsframework.collection;

import batch2.collectionsframework.Student;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<Student> students = new LinkedList<>();

        students.add(new Student("s123","John", 10,90.0));
        students.add(new Student("s120","Dev", 11,85.0));
        students.add(new Student("s121","Krish", 8,82.0));
        students.add(new Student("s125","Devaki", 9,60.0));
        students.add(new Student("s130","Seeta", 15,70.0));
        students.add(new Student("s121","Krish", 8,82.0));

        System.out.println(students);
    }
}
