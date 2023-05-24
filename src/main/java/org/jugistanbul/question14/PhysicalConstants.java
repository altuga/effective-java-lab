package org.jugistanbul.question14;


public enum PhysicalConstants {

     PI(3.14159),
     C(3*10e8);
     private double value ;


     PhysicalConstants(double value) {
          this.value = value;
     }

     public double getValue() {
          return value;
     }

     public double calculate() {
          return 4*5 ;
     }

}