package com.shellcore.java.inheritance;

/**
 * Created by Cesar. 08/05/2017.
 */
public class Car {

    private int topSpeed;

    public Car(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void getDescription() {
        System.out.println("Car");
    }
}
