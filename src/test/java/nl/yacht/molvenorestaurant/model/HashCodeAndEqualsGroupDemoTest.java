package nl.yacht.molvenorestaurant.model;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class HashCodeAndEqualsGroupDemoTest {

    @Test
    public void testDemoRegardingEqualsMethod() {


        List<Drink> drankjes = new ArrayList<>();

        Assert.assertEquals(0, drankjes.size());
        {
            Drink a = new Drink();
            a.setName("Cola");

            drankjes.add(a);
        }

        Assert.assertEquals(1, drankjes.size());



        Drink b = new Drink();

        b.setName("Cola");


        // all drinks will be removed which Drink::equals method returns true
        drankjes.remove(b);

        Assert.assertEquals(0, drankjes.size());

    }
}
