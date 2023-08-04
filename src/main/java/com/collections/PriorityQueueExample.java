package com.collections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String args[]){
        Queue<Person> peoples = new PriorityQueue<>(new PersonComparator());

        peoples.add(new Person("Kranti", "Pune", 100, 20));
        peoples.add(new Person("Shakti", "Indore", 221, 22));
        peoples.add(new Person("Bhakti", "Mumbai", 101, 25));
        peoples.add(new Person("Ansh", "Chennai", 201, 19));
        peoples.add(new Person("Hari", "Hyderabad", 195, 24));
        peoples.add(new Person("Shiva", "Delhi", 180, 21));

        System.out.println("Poll Result is:");

        while (!peoples.isEmpty()){
            System.out.println(peoples.poll());
        }

        Queue<Integer> pQ = new PriorityQueue<>();


        pQ.add(10);
        pQ.add(2);
        pQ.add(8);
        pQ.add(3);
        pQ.add(7);
        pQ.add(4);
        pQ.add(5);

        Iterator<Integer> it= pQ.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
        while (!pQ.isEmpty()){
            System.out.println(pQ.poll());
        }
    }
}
