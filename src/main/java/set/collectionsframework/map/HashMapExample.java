package batch2.collectionsframework.map;

import batch2.collectionsframework.Student;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Student> studentMap = new HashMap<>();

        studentMap.put("2023BSC123", new Student("s123","John", 10,90.0));
        studentMap.put("2023BCA120", new Student("s120","Dev", 11,85.0));
        studentMap.put("2023BCS121", new Student("s121","Krish", 8,82.0));
        studentMap.put("2023BCA125", new Student("s125","Devaki", 9,60.0));
        studentMap.put("2023BCS130", new Student("s130","Seeta", 15,70.0));
        studentMap.put("2023BSC124", new Student("s124","Peter", 12,88.0));

        for(Map.Entry<String, Student> students : studentMap.entrySet()){
            System.out.println("Key : "+ students.getKey()+ " Value is :" + students.getValue());
        }
        System.out.println("Returns the value associated with key "+ studentMap.get("2023BCS121"));

        System.out.println(studentMap.put("2023BSC124", new Student("s132","Sam", 16,84)));

        System.out.println("Student associate with 2023BSC124 is : "+ studentMap.get("2023BSC124"));

        System.out.println(studentMap.put("2023BSC129", new Student("s123","John", 10,90.0)));
    }
}
