package batch2.collectionsframework.collection;

import java.util.Iterator;
import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue<String> queue = new java.util.PriorityQueue<>();
        queue.add("five");
        queue.add("nine");
        queue.add("three");
        queue.add("one");
        queue.add("seven");

        Iterator<String> itr = queue.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

        Queue<Integer> integers = new java.util.PriorityQueue<>();
        integers.add(5);
        integers.add(9);
        integers.add(3);
        integers.add(1);
        integers.add(7);

        Iterator<Integer> it = integers.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
