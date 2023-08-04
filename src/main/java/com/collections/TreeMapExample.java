package com.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

    public static void main(String args[]){
        Map<Integer, PersonD> personDMap = new TreeMap<>();

        personDMap.put(5, new PersonD("kranti", "pune", 104, 28));
        personDMap.put(3, new PersonD("bhakti", "pune", 102, 18));
        personDMap.put(2, new PersonD("sita", "pune", 101, 25));
        personDMap.put(4, new PersonD("shakti", "pune", 103, 30));
        personDMap.put(1, new PersonD("Ram", "pune", 100, 21));
        //personDMap.put(null, new PersonD("Dev", "pune", 105, 28));
        //personDMap.put(null, new PersonD("KDev", "pune", 106, 28));
        personDMap.put(6, null);

        for (Map.Entry<Integer, PersonD> me : personDMap.entrySet()) {
            System.out.println("Key: "+me.getKey()+" Value: "+ me.getValue());
        }
     }
}
