package org.example.liskov.examples;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        Shape square = new Square(5);

        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Square area: " + square.getArea());
    }
}
