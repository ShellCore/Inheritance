package com.shellcore.java.inheritance;

/**
 * Created by Cesar. 08/05/2017.
 */
public class F1Car extends Car {

    public F1Car(int topSpeed) {
        super(topSpeed);
    }

    @Override
    public void getDescription() {
        System.out.println("F1 Car");
    }
}
