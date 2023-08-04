package batch2.collectionsframework.map;

import batch2.collectionsframework.Student;
import com.collections.PersonD;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    public static void main(String[] args) {
        Map<String, Student> students = new TreeMap<>();

        students.put("Seventh", new Student("2023BIT110","Jay", 1000, 80.85));
        students.put("Fifth", new Student("2023BIT115","Dev", 1010, 70.85));
        students.put("Second", new Student("2023BIT112","Seeta", 1005, 85.85));
        students.put("Sixth", new Student("2023BIT117","Krish", 1021, 82.85));
        students.put("First", new Student("2023BIT111","Devika", 1015, 60.85));
        students.put("Third", new Student("2023BIT113","Ganesh", 1018, 75.85));

        //students.put(null, null); // won't work
        //students.put("Ninth", null); // works
        for (Map.Entry<String, Student> me : students.entrySet()) {
            System.out.println("Key: "+me.getKey()+" Value: "+ me.getValue());
        }
    }
}
