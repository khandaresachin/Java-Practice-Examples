package batch2.collectionsframework.collection;

import batch2.collectionsframework.Student;

import java.util.Iterator;
import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {

        Stack<Student> students = new Stack<>();
        students.push(new Student("s123","John", 10,90.0));
        students.push(new Student("s120","Dev", 11,85.0));
        students.push(new Student("s130","Seeta", 15,70.0));
        students.push(new Student("s125","Devaki", 9,60.0));
        students.push(new Student("s121","Krish", 8,82.0));

        Iterator<Student> itr = students.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        if(students.isEmpty()){
            System.out.println("Stack is empty");
        }
        System.out.println("Element at top of stack is : "+ students.peek());

        System.out.println("Top element is removed: "+ students.pop()); // remove the one element from stack
        System.out.println("Element at top of stack is after pop operation : "+ students.peek());

    }
}
 /*   Push(10)
    pop()

FILO -- First In Last Out
LIFO -- Last In First Out

|  6 | -- top
|  9 |
|  5 |
|  7 |
|  8 |
|  2 |   -- element 1
-----*/


