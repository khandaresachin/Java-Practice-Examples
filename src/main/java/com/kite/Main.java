package com.kite;

import java.util.Arrays;

public class Main {

    public static void main(String args[]){
        Immutable obj = new Immutable("ABCD", 1234);

        System.out.println("Name "+ obj.getName());
        System.out.println("Number "+ obj.getNumber());


    }
}
