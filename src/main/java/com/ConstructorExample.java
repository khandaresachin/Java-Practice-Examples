package com;

public class ConstructorExample {
    int num;
    String name;
    float percentage;

    // default contructors
    public ConstructorExample() {
        num = 10;
        name = "ABCDE";
        percentage = 78.0F;
    }

    // parameterized constructor
    public ConstructorExample(int num, String name, float percentage) {
        this.num = num;
        this.name = name;
        this.percentage = percentage;
    }

    public static void main(String args[]) {
        ConstructorExample obj1 = new ConstructorExample(123, "HFSD", 12.0f);
        ConstructorExample obj2 = new ConstructorExample();
        ConstructorExample obj3 = new ConstructorExample();
        ConstructorExample obj4 = new ConstructorExample();

        obj1.name = "MNOP";
    }
}

/*
    Constructor
        is it necessary to write constructor ? No..

    - Default Constructor
        - constructor same name as class with no arguments

    - Parameterized constructor
        - constructor with arguments


 */
