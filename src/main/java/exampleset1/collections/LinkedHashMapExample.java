package com.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

    public static void main(String args[]) {
        Map<String, PersonD> personDMap = new LinkedHashMap<>();

        personDMap.put("one", new PersonD("Ram", "pune", 100, 21));
        personDMap.put("two", new PersonD("sita", "pune", 101, 25));
        personDMap.put("three", new PersonD("bhakti", "pune", 102, 18));
        personDMap.put("four", new PersonD("shakti", "pune", 103, 30));
        personDMap.put("five", new PersonD("kranti", "pune", 104, 28));
        personDMap.put(null, new PersonD("Dev", "pune", 105, 28));
        personDMap.put(null, new PersonD("KDev", "pune", 106, 28));
        personDMap.put("six", null);

        for (Map.Entry<String, PersonD> me : personDMap.entrySet()) {
            System.out.println(me.getKey());
            System.out.println(me.getValue());
        }
    }
}
