package nl.yacht.molvenorestaurant.model.abstracting;

public class Male extends Person {

    @Override
    public void drink() {

        System.out.println("Drinking beer ... ");
    }

    public void driveFerrari() {
        System.out.println("Male driving ferrari");
    }

}
