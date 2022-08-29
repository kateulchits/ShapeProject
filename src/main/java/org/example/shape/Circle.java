package org.example.shape;

public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        shapeName = "Circle";
    }

    @Override
    public double getArea() {
        area = Math.PI * Math.pow(radius, 2);
        return area;
    }
}

