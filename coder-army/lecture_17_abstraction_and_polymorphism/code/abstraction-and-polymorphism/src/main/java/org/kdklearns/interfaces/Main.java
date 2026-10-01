package org.kdklearns.interfaces;

public class Main {

    public static void main(String[] args) {
        Car car = new FuelCar();
        System.out.println("It's color is " + Car.color);
        car.start();
        car.accelerate();
        car.honk();
        car.brake();

        System.out.println();

        car = new ElectricCar();
        // new ElectricCar().color returns a completely different object altogether whose reference type is ElectricCar not Car
        System.out.println("It's color is " + new ElectricCar().color);
        car.start();
        car.accelerate();
        car.honk();
        car.brake();

        Car.greet();
    }
}
