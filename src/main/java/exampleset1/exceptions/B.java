package com.exceptions;

public class B extends A{

    public void print()throws ArithmeticException {
        System.out.println("Print() from A");
    }

    @Override
    public void display() throws ArithmeticException {
        super.display();
    }


}
