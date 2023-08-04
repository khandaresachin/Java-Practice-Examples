package com.abstrct.interfc;

public class Bike implements Vehicle {
    int speed;

    public Bike(int speed){
        this.speed =speed;
    }
    @Override
    public void speedUp(int a) {
        speed = speed + a;
    }

    public int getSpeed() {
        return speed;
    }
}
