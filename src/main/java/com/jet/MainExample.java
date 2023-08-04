package com.jet;

import com.basic.EncapsExample;

public class MainExample extends EncapsExample{
    static int a=10;
    int b =20;
    public static void main(String args []){
        System.out.println(a);
        //System.out.println(b);  this won't be possible

        FirstExample object = new FirstExample();
        object.getThatPrivate();  // public method
        object.getThatPrivateMem(); // protected method
        a=100;
        System.out.println(a);
        MainExample obj = new MainExample();
        obj.display();

        EncapsExample example = new EncapsExample();
        example.display(); // public method


    }

    public void display(){
        System.out.println(a);
        print();
    }

    public static void print(){
        System.out.println(a);
    }
}
