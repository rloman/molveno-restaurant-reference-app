package nl.yacht.molvenorestaurant.synchronisation;

public class NatasjaTrainer {

    private Integer counter;


    public synchronized void telOp() {


    }

    // alternatief
    public void telOpAlternate() {
        synchronized (counter) {
            counter++;
        }
    }

    public static void main(String[] args) {

        NatasjaTrainer t = new NatasjaTrainer();


        // als we spelen dat ze nu een thread zijn dan werkt het.
        t.telOp();

        t.telOp();

    }
}
