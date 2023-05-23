package org.jugistanbul.question08.fixed;

public class Circle extends Figure{

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculateArea() {
        return Math.PI * (radius * radius);
    }
}