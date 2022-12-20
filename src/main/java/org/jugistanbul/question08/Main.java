package org.jugistanbul.question08;

import org.jugistanbul.question08.fix.Circle;
import org.jugistanbul.question08.fix.Figure;
import org.jugistanbul.question08.fix.Rectangle;

public class Main {

    public static void main(String[] args) {
        Figure figure = new Circle(5.0);
        System.out.println(" " + figure.calculateArea());
        figure = new Rectangle(2,4);
        System.out.println(" " + figure.calculateArea());

    }
}
