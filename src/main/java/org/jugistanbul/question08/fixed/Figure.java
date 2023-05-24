package org.jugistanbul.question08.fixed;

public interface  Figure {

     double calculateArea();

    default public double calculateRange() {
        return 5* 9 ;
    }

}
