package org.jugistanbul.question28;


import java.util.List;

/**
 *
 * TODO
 *
 * 1 - Run CarClassifier.java
 * 2 - What does this program print?
 * 3 - How can you print "Car - BMW - Mercedes"  ?
 */
public class CarClassifier {

    public  String classify(Car car) {

        System.out.println(car.sayModel());
        /*if (car instanceof BMW) {
            System.out.println("BMW");
            BMW bmw = (BMW) car;
            bmw.sayModel();
            this.classify(bmw);
        }*/
        System.out.println("Car");
        return "Car";
    }


    public  String classify(BMW bmw) {
        System.out.println("BMW");
        return "BMW";
    }


    public  String classify(Mercedes mercedes) {
        System.out.println("Mercedes");
        return "Mercedes";
    }

    public static void main(String[] args) {
        List<Car> collections = List.of(
                new Car(),
                new Mercedes(),
                new BMW()
        );

        CarClassifier carClassifier = new CarClassifier();

        for (Car car : collections)
            System.out.println(carClassifier.classify(car));
    }
}
