package org.kdklearns.abstract_classes;

public class ElectricCar extends Car{

    String color = "Grey";

    void accelerate() {
        System.out.println("Electric car is accelerating");
    }

    void brake() {
        System.out.println("Electric car is slowing down");
    }
}
