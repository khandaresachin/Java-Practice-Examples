package com.jet;

public class FirstExample {


    public static String name;

    public static void main(String args[]){
      /*  FirstExample obj = new FirstExample();
        obj.getPrivateInfo();  // private method
        obj.getThatPrivateMem(); // protected method
        obj.getThatPrivate();  // public method*/


    }

    private void getPrivateInfo(){
    }

    public void getThatPrivate(){
        getPrivateInfo();
    }

    protected void getThatPrivateMem(){
        getPrivateInfo();
    }
}

/*
    Class has two types of members:
        - Object level
            - non static
        - Class level
            - static

 Class is instantiated -- we created the object
        memory allocation will happen for object level data members and member functions


String Constant Pool (SCP)

    String str ="java"    // this will be created on SCP if not found already.

    String str1 =  new String("java")   // will be created outside of SCP in heap area.
    str1.intern();

    String str2 =new String("programming").intern();

static:
    - static members are at class level
    - static data members can not be created into any(static and non static) member functions.
    - static can call only other static members. that means static function can call to static
     member function and data member.
    - non static can call both static data member and static member function.
    - But reverse of it is not possible, that means the static functions can not call non static
    data member and non static member function.


final keyword:

    Variable --- To create the constant variable in java
    Methods --- Prevents method overriding
    Class  --- It Prevents inheritance


How to implement the any class as Immutable class
    - In java all the wrapper classes (like Integer, Float, Short, Boolean) and String is
      immutable.

Requirements to create class as Immutable
    - The class must be declared as final so that subclass can't be created.
    - All the data members in the class must be declared as private so that those can't be accessed.
    - All the data members should be declared as final so that we can't change the values once object
      created.
    - A parameterized constructor should initialize  all fields with deep copy.
    - We should not have setter methods for all the data members.


    Note: Wrapper classes and any immutable class either we use shallow or deep copy that doesn't matter.

-------------------------------------------------------------------------------------

Arrays:



 */