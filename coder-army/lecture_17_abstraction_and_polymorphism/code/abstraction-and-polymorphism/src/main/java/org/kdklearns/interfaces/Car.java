package org.kdklearns.interfaces;

interface Car {

    // public, static and final by default
    String color = "Black";

    static void greet() {
        System.out.println("Car says Hi!");
    }

    default void start() {
        System.out.println("The car is starting");
    }

    default void honk() {
        System.out.println("Beep Beep");
    }

    void accelerate();
    void brake();
}
