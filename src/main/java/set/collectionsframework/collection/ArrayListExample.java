package batch2.collectionsframework.collection;

import batch2.collectionsframework.Student;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        //array of 1000 ... at most 1000 indexes will get created
        // if in case we want to expand size beyond 1000 it is not supported with array
        names.add("Pune");
        names.add("Mumbai");
        names.add("Delhi");
        names.add("Chennai");
        names.add("Cuttack");
        names.add("SriNagar");
        names.add("Hyderabad");

        names.add("Nashik");
        names.add("Pune");
        names.add("Hyderabad");


        names.add(2, "Patna");
        System.out.println(names);
        System.out.println(names.size());
        System.out.println(names.contains("Nashik"));
        System.out.println("************************");
        Iterator<String> it = names.iterator();
        int counter = 0;
        while (it.hasNext()){
            String city = it.next();
            System.out.println(city);
            if(city.equals("Hyderabad"))
                counter++;
        }

        System.out.println("Hyderabad is there in list "+ counter + " times");
        System.out.println("************************");
        List<Student> students = new ArrayList<>();
        students.add(new Student("s123","John", 10,90.0));
        students.add(new Student("s120","Dev", 11,85.0));
        students.add(new Student("s121","Krish", 8,82.0));
        students.add(new Student("s125","Devaki", 9,60.0));
        students.add(new Student("s130","Seeta", 15,70.0));

        //System.out.println(students);
        Iterator<Student> iterator = students.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }


    }
}
