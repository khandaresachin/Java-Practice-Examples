package com.abstrct.interfc;

public class VehicleSimulator {

    public static void main(String args[]) {

        Bike bike = new Bike(40);
        bike.speedUp(20);
        Car car = new Car(40);
        car.speedUp(20);

        System.out.println(bike.getSpeed());
        System.out.println(car.getSpeed());
    }
}
