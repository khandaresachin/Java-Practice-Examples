package com.abstrct;

public class ShapeExecutor {

    public static void main(String args[]){

        Shape s1 =new Circle(5.3);

        Shape s2 = new Rectangle(5, 2);

        System.out.println(s1.calculateArea());
        System.out.println("--------");
        System.out.println(s2.calculateArea());

    }
}
