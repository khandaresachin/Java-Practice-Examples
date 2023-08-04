package com.jet;

public class FinalKeywrdExample {

    public static final int a = 100;

    public static void main(String args[]){

        System.out.println(a);

        // a=200;  // this can not be done as its final variable

        System.out.println(a);
    }
}
