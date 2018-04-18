package nl.yacht.molvenorestaurant.model.abstracting;

public class Main {

    public static void main(String[] args) {

        Person male = new Male();

        male.drink();

        Person female = new Female();

        female.drink();

        Person male2 = new Male();
        male2.drink();


        Male male3 = new Male();
        male3.driveFerrari();

        male3.drink();






    }
}