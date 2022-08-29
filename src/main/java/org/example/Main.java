package org.example;

import org.example.shape.Circle;
import org.example.shape.Rectangle;
import org.example.shape.Square;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12);
        Square square = new Square(9);
        Rectangle rectangle = new Rectangle(7, 8);
        System.out.println(circle.getArea());
        System.out.println(square.getArea());
        System.out.println(rectangle.getArea());
    }

}