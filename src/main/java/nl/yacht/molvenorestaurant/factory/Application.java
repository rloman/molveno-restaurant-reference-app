package nl.yacht.molvenorestaurant.factory;

import nl.yacht.molvenorestaurant.factory.domain.Audi;
import nl.yacht.molvenorestaurant.factory.domain.CarFactory;

public class Application {

    public static void main(String[] args) {
        Car c = CarFactory.getMercedes();

        Car d = CarFactory.getAudi();
    }
}
