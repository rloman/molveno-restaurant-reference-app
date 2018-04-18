package nl.yacht.molvenorestaurant.factory.domain;

import nl.yacht.molvenorestaurant.factory.Car;

public class Audi implements Car {

    private int kmstand;

    Audi(int kmstand) {

        this.kmstand = kmstand;

    }

    @Override
    public void drive() {
        System.out.println("Driving Audi ... ");

    }
}
