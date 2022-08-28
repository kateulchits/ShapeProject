package org.example.shape;

public class Circle extends Shape {
    private double radius;
    private double area;

    public Circle(double radius) {
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
        shapeName = "Circle";
    }

    public void setRadius(double radius) {
        this.radius = radius;
        area = Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getArea() {
        return area;
    }
}

