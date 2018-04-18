package nl.yacht.molvenorestaurant.factory.domain;

import nl.yacht.molvenorestaurant.factory.Car;
import nl.yacht.molvenorestaurant.factory.domain.Audi;
import nl.yacht.molvenorestaurant.factory.domain.Mercedes;
import nl.yacht.molvenorestaurant.factory.domain.Skoda;

public final class CarFactory {

    public static Car getMercedes() {
        return new Mercedes("CC");
    }

    public static Car getSkoda() {
        return new Skoda();
    }

    public static Car getAudi() {
        return new Audi(56);
    }

    private CarFactory() {

    }
}
