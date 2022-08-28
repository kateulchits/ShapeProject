package org.example.shape;

public class Rectangle extends Shape {
    private double sideA;
    private double sideB;

    public Rectangle( double sideA, double sideB){
        this.sideA = sideA;
        this.sideB = sideB;
        shapeName = "Rectangle";
    }

    @Override
    public double getArea() {
        return sideA * sideB;
    }
}
