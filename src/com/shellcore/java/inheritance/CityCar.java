package com.shellcore.java.inheritance;

/**
 * Created by Cesar. 08/05/2017.
 */
public class CityCar extends Car {

    private int seatingCapacity;

    public CityCar(int topSpeed, int seatingCapacity) {
        super(topSpeed);
        this.seatingCapacity = seatingCapacity;
    }

    @Override
    public void getDescription() {
        System.out.println("City Car");
    }
}
