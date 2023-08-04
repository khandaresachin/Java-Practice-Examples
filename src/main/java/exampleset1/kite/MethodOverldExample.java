package com.kite;

import java.util.Arrays;

public class MethodOverldExample {

    // MethodOverloading
        /*
        Method overloading means when we create more than one methods with same name
        and different parameters along with same datatypes which the same class.
        - This is done within the same class.

         */

    // Method overriding
    /*
    This is also example of polymorphism
    - This is done using inheritance.
    - The subclass will have same name method as well as same parameters.
     */

    public void display(){
        System.out.println("Hello");
    }

    public void display(String name){
        System.out.println(name);
    }

    public void display(String firstName, String lastName){
        System.out.println(firstName);
        System.out.println(lastName);


    }
}
