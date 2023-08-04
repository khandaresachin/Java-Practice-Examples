package com.collections;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class ComparatorExample {

    public static void main(String args[]) {

        Set<Student> students = new TreeSet<>(new StudentNameComparator());

        students.add(new Student("Ram", "IT", 78.0, 100));
        students.add(new Student("Sham", "Mech", 80.0, 101));
        students.add(new Student("Dev", "CO", 75.5, 102));
        students.add(new Student("Kashi", "INT", 78.8, 103));
        students.add(new Student("Ram", "EXTC", 92.0, 104));
        students.add(new Student("Kashi", "Mech", 81.2, 105));
        students.add(new Student("Sham", "CO", 72.5, 106));

        Iterator<Student> itrt = students.iterator();

        while (itrt.hasNext()){
            System.out.println(itrt.next());
        }


    }
}
