package com.collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

    public static void main(String args[]){

        Deque<PersonD> personDS = new ArrayDeque<>();

        personDS.add(new PersonD("Kranti", "Pune", 100, 20));
        personDS.add(new PersonD("Shakti", "Indore", 221, 22));
        personDS.add(new PersonD("Bhakti", "Mumbai", 101, 25));
        personDS.add(new PersonD("Ansh", "Chennai", 201, 19));
        personDS.add(new PersonD("Hari", "Hyderabad", 195, 24));
        personDS.add(new PersonD("Shiva", "Delhi", 180, 21));
        personDS.addFirst(new PersonD("Keshav", "Pune", 175, 28));
        System.out.println("First: "+ personDS.getFirst());
        System.out.println("Last: "+ personDS.getLast());

        System.out.println("Remove the last: "+ personDS.pollLast()); // remove the last element of queue
        personDS.addLast(new PersonD("Dev", "Mumbai", 185, 30));
        System.out.println("Newly updated last: "+ personDS.getLast());

       /* Iterator<PersonD> it = personDS.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }*/

    }
}
