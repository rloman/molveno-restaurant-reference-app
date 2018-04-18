package nl.yacht.molvenorestaurant.factory.domain;

import nl.yacht.molvenorestaurant.factory.Car;

public class Mercedes implements Car {

    Mercedes(String type) {

    }

    @Override
    public void drive() {
        System.out.println("Driving Mercedes");
    }
}
