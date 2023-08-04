package com.abstrct.interfc;

public class Car implements Vehicle {
    int speed;

    public Car(int speed) {
        this.speed = speed;
    }

    @Override
    public void speedUp(int a) {
        speed = speed + a + 10;
    }

    public int getSpeed() {
        return speed;
    }
}
