package com.abstrct;

public class Circle extends Shape{
    double radius;

    // to initialize the value of radius at the time of object creation
    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }
}
