package com.collections;

import java.util.Comparator;

public class StudentNameComparator implements Comparator<Student> {

    @Override
    public int compare(Student e1, Student e2) {
        return e1.getName().compareTo(e2.getName());
    }
}
