package nl.yacht.molvenorestaurant.factory.domain;

import nl.yacht.molvenorestaurant.factory.Car;

public class Skoda implements Car {

    Skoda() {

    }

    @Override
    public void drive() {
        System.out.println("Driving skoda");
    }
}
