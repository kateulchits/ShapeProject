package org.example.shape;

public abstract class Shape {
    protected String shapeName;
    public abstract double getArea();

    public String getShapeInfo() {
        return "Shape type is: "+shapeName;
    }
}
