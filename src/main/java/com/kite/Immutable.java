package com.kite;

public final class Immutable {

    private String name;
    private int number;


    public Immutable(String name, int number){
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }
}
