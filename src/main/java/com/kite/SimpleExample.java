package com.kite;

import com.jet.FirstExample;

public class SimpleExample  extends FirstExample{

    public static void main(String args[]){
        FirstExample firstExample = new FirstExample();  // Object created outside of package
        firstExample.getThatPrivate(); // Only public method is accessible


    }
   /*public static void main(String args[]){
       Real r1 = new Real(); // default constructor
       Real r2 = new Real(); // default constructor
       System.out.println("r1 values");
       System.out.println(r1.getName());
       System.out.println(r1.getNumber());
       r1.setName("MNO");

       System.out.println("r1 updated values");

       System.out.println(r1.getName());
       System.out.println(r1.getNumber());

       System.out.println("r2 values");
       System.out.println(r2.getName());
       System.out.println(r2.getNumber());

       Real r3 = new Real("XYZ", 500); // parametrized constructor

       System.out.println("r3 values");
       System.out.println(r3.getName());
       System.out.println(r3.getNumber());
   }*/
}
