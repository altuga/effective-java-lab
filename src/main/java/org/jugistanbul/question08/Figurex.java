package org.jugistanbul.question08;

/**
 * Altug Bilgin Altintas
 * 
 * Effective Java Workshop
 *
 * Twitter : @altugaltintas
 */


/*
TODO: 
 1 - Calculate SQUARE's area in the same code  - 5 min
 2 - Is this class compatible with SOLID principles ?
 3 - Try to refactor according to SOLID principles - 5 mins
 4 - Instructor will show the solutions
 5 - Refactor and ask questions 
*/
class Figurex {
    enum Shape { RECTANGLE, CIRCLE  };

    // Tag field - the shape of this figure
    final Shape shape;

    // These fields are used only if shape is RECTANGLE
    double length;
    double width;

    // This field is used only if shape is CIRCLE
    double radius;

    // Constructor for circle
    Figurex(double radius) {
        shape = Shape.CIRCLE;
        this.radius = radius;
    }

    // Constructor for rectangle
    Figurex(double length, double width) {
        shape = Shape.RECTANGLE;
        this.length = length;
        this.width = width;
    }

    double calculateArea() {
        switch(shape) {
            case RECTANGLE:
                return length * width;
            case CIRCLE:
                return Math.PI * (radius * radius);
            default:
                throw new AssertionError(shape);
        }
    }

    public static void main(String[] args) {
        Figurex figure = new Figurex(3,4);
        System.out.println(figure.calculateArea());

    }
}
