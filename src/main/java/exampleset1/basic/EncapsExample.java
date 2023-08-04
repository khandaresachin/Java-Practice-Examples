package com.basic;

public class EncapsExample {
    private static String name;
    public static void main(String args[]){

        name = "ABCD";
        getName();

        EncapsExample example = new EncapsExample();
        example.display();  // public method    all accessible openly for all
        // the classes within same package or outside of the package even
        // outside of the project if we add the jar file of this project we
        // will be able to access those
        example.show();   // protected method
        // we can access within the same package as well as from the subclasses.

        example.print();  // private method
        // We can only access the private within the class

    }

    public void display(){

        System.out.println("You are in display()");
    }

    private void print(){
        System.out.println("You are in print()");
    }

    protected void show(){
        System.out.println("You are in show()");
        //getName();
    }

    public static void getName(){
        System.out.println("Name is :"+ name);
    }

}
