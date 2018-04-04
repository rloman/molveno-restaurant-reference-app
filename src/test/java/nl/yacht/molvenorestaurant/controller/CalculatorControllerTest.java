package nl.yacht.molvenorestaurant.controller;

import nl.yacht.molvenorestaurant.model.CalculatorResult;
import nl.yacht.molvenorestaurant.utils.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;
/*
import static org.mockito.Mockito.when;

*/
@RunWith(MockitoJUnitRunner.class)
public class CalculatorControllerTest {

    @InjectMocks
    private CalculatorController controller;

    @Mock
    private Calculator calculator;

    @Test
    public void testAddForController() {

        // maak een loop als je dat wilt ...

        //mock it
       Mockito.when(this.calculator.add(3,4 )).thenReturn(7);

       // do it

        CalculatorResult r = this.controller.addSomeValues(3,4);

        Assert.assertEquals(3, r.getA());
        Assert.assertEquals(4, r.getB());
        Assert.assertEquals("+", r.getOperator());
        Assert.assertEquals(7, r.getResult());

    }
}
