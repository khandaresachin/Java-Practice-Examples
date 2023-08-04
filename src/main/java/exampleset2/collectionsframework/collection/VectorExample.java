package batch2.collectionsframework.collection;

import batch2.collectionsframework.Student;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorExample {
    public static void main(String[] args) {
        List<Student> students = new Vector<>();
        students.add(new Student("s123","John", 10,90.0));
        students.add(new Student("s120","Dev", 11,85.0));
        students.add(new Student("s121","Krish", 8,82.0));
        students.add(new Student("s125","Devaki", 9,60.0));
        students.add(new Student("s130","Seeta", 15,70.0));

        Iterator<Student> it = students.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
