package org.kdklearns.abstract_classes;

import org.kdklearns.abstract_classes.Car;
import org.kdklearns.abstract_classes.ElectricCar;
import org.kdklearns.abstract_classes.FuelCar;

public class Main {

    public static void main(String[] args) {
        Car car = new ElectricCar();
        System.out.println(car.color);
        car.start();
        car.accelerate();
        car.honk();
        car.brake();

        System.out.println();

        System.out.println(car.color);
        car = new FuelCar();
        car.start();
        car.accelerate();
        car.honk();
        car.brake();

        ElectricCar ec = new ElectricCar();
        System.out.println("\n" + ec.color);
    }
}