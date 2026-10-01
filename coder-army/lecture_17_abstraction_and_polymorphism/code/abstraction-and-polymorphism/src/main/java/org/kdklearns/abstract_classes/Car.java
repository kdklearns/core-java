package org.kdklearns.abstract_classes;

abstract public class Car {

    String color = "Black";

    void start() {
        System.out.println("The car has started");
    }

    void honk() {
        System.out.println("Beep Beep!");
    }

    abstract void accelerate();
    abstract void brake();
}
