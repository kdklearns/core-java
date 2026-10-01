package org.kdklearns.abstract_classes;

public class FuelCar extends Car{

    @Override
    void accelerate() {
        System.out.println("Fuel Car is accelerating");
    }

    @Override
    void brake() {
        System.out.println("Fuel Car is now slowing down");
    }
}
