package org.example.shape;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
        shapeName = "Square";
    }

    public double getArea(){
        return Math.pow(side,2);
    }

}