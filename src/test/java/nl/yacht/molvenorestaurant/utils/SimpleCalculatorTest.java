package nl.yacht.molvenorestaurant.utils;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SimpleCalculatorTest {

    private SimpleCalculator calculator;


    @Before
    public void setUp() {
        this.calculator = new SimpleCalculator();
    }


    @Test
    public void testAdd() {

        int sum = this.calculator.add(2, 3);

        Assert.assertEquals(5, sum);

    }

    @Test
    public void testSubtract() {

        int diff = this.calculator.subtract(7, 5);

        Assert.assertEquals(2, diff);

    }


    @Test
    public void testMultiply() {
        int product = this.calculator.multiply(11, 11);

        Assert.assertEquals(121, product);
    }

    @Test
    public void testDivide() {
        Assert.assertEquals(4, this.calculator.divide(16,4));
    }

    @After
    public void tearDown() {
        this.calculator = null;
    }

}
