package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String args[]){
        Map<String,PersonD> personDMap = new HashMap<>();

        personDMap.put("one", new PersonD("Ram", "pune", 100, 21));
        personDMap.put("two", new PersonD("sita", "pune", 101, 25));
        personDMap.put("three", new PersonD("bhakti", "pune", 102, 18));
        personDMap.put("four", new PersonD("shakti", "pune", 103, 30));
        PersonD returnOne = personDMap.put("five", new PersonD("kranti", "pune", 104, 28));
        System.out.println(returnOne);
        personDMap.put(null , new PersonD("Dev", "pune", 105, 28));
        PersonD returnTwo = personDMap.put(null , new PersonD("KDev", "pune", 106, 28));
        System.out.println(returnTwo);
        personDMap.put("six" , null);

        for(Map.Entry<String, PersonD> me : personDMap.entrySet()){
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }

    }
}
