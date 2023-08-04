package com.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ForEachExample {

    public static void main(String args[]){

        List<String> list= new ArrayList<>();
        list.add("ABC");
        list.add("ABC");
        list.add("ABC");
        list.add("ABC");
        list.add("ABC");
        list.add("ABC");

       /* Iterator<String> it = list.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }*/

        list.forEach(s -> System.out.println(s));

    }
}
