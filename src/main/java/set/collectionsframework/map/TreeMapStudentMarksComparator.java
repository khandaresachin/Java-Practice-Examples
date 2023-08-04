package batch2.collectionsframework.map;

import batch2.collectionsframework.map.StudentComp;
import batch2.collectionsframework.map.StudentMarksComparator;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapStudentMarksComparator {
    public static void main(String[] args) {
        TreeMap<StudentComp, String> students = new TreeMap<>(new StudentMarksComparator());
        students.put(new StudentComp("2023BIT117","Krish", 1021, 82.85), "Sixth");
        students.put(new StudentComp("2023BIT115","Dev", 1010, 70.85), "Fifth");
        students.put(new StudentComp("2023BIT111","Devika", 1015, 60.85), "First");
        students.put(new StudentComp("2023BIT113","Ganesh", 1018, 75.85), "Third");
        students.put(new StudentComp("2023BIT110","Jay", 1000, 80.85),"Seventh");
        students.put(new StudentComp("2023BIT112","Seeta", 1005, 85.85), "Second");

        for (Map.Entry<StudentComp, String> me : students.entrySet()) {
            System.out.println("Key: "+me.getKey()+" Value: "+ me.getValue());
        }
    }
}
