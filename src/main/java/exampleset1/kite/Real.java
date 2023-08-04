package com.kite;

public class Real {

    private String name;
    private int number;

    public Real(String name, int number){
        this.name = name;
        this.number = number;
    } // initializing the data members when we create the object of the class.

    public Real(){
        this.name = "ABC";
        this.number = 1000;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

}
