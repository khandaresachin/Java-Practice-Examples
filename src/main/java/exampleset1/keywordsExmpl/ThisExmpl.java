package com.keywordsExmpl;

public class ThisExmpl extends Exmpl{

    int num1=5;
    static int num2=10;

    public ThisExmpl(){
        super(100);
        this.display();
        super.a = 50;

    }
    public ThisExmpl(int a){
        super();  // default constructor
        //  super(100); this can't be done as we already called default
        // constructor above
        super.a = 100; // data member
        super.printThatVar();  // member function

        this.num1 = a;
    }

    @Override
    public void printThatVar(){
        super.printThatVar(); // method from super class
    }
    void print(int num){
        int num1= 50;
        //int num2=100;

        this.num1 = num;
        num2 = 1000;
    }

    void display(){
        System.out.println("This is display()");
    }

    void show(){
        System.out.println("This is show()");
    }

    public static void main(String args[]){
        ThisExmpl obj = new ThisExmpl(100);
        obj.print(20);
        ThisExmpl obj2 = new ThisExmpl();
        obj2.print(30);

    }

}
/*


this -- To reference to current class instance variables
        We can call all the data members of same class using this keyword.
        We can't call static data members using this keyword.
        we can use this keyword to initialize the data members into constructor.
        There is possibility of calling member functions using this into constructor or in
        any member function.

super -- To reference to super class members we use super keyword.
        Only possibility to use into sub classes.

        Using super we can access super class constructors, data members(non static) and member
        functions (non static)
        We can call super class constructor from sub class constructor but the call to
        super class constructor should be the first thing.
        At a time we can only call one constructor of super class from sub class.

 */