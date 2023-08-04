package com.kite;

import java.util.Arrays;

public class A {

    public int [] data;

    public A(int[] values){
        //data = val ;// shallow copy
        data = new int[values.length];

        for(int i=0; i< data.length; i++){
            data[i] = values[i];   // Deep copy
        }

    }

    public void showData(){
        System.out.println(Arrays.toString(data));
    }
}
