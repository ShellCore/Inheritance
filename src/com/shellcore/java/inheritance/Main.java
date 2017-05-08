package com.shellcore.java.inheritance;

/**
 * Created by Cesar. 04/05/2017.
 */
public class Main {

    public static void main(String[] args) {
        Car ferrari = new F1Car(320);
        Car coupe = new Car(220);

        ferrari.getDescription();
        coupe.getDescription();

        Car tsuru = new CityCar(180, 5);
        tsuru.getDescription();
    }
}
