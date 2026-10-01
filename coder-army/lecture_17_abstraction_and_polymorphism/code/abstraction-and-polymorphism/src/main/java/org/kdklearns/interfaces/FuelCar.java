package org.kdklearns.interfaces;

public class FuelCar implements Car {

    @Override
    public void accelerate() {
        System.out.println("Fuel car is accelerating");
    }

    @Override
    public void brake() {
        System.out.println("Fuel car is slowing down");
    }
}
