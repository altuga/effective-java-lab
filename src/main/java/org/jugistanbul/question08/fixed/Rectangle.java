package org.jugistanbul.question08.fixed;

public class Rectangle implements Figure{

    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double calculateArea() {
        return length*width;
    }
}
