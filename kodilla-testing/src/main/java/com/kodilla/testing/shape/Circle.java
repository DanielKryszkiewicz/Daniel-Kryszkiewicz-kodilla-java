package com.kodilla.testing.shape;

public class Circle implements Shape {

    private double Pi =  3.1415;
    private double r;

    public Circle (double Pi, double r){
        this.Pi = Pi;
        this.r = r;
    }
    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return Pi*(r*r);

    }
}
