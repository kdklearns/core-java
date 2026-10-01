package org.kdklearns.interfaces;

public class ElectricCar implements Car {

    String color = "Grey";

    static void greet() {
        System.out.println("Electric Car says Hi!");
    }
    @Override
    public void accelerate() {
        System.out.println("Electric Car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Electric car is slowing down");
    }
}
