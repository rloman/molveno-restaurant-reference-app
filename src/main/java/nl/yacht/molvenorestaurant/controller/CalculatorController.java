package nl.yacht.molvenorestaurant.controller;

import nl.yacht.molvenorestaurant.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

public class CalculatorController {

    @Autowired
    private Calculator calculator; // dit is dus de INTERFACE

    public int addSomeValues(int a, int b) {


        return this.calculator.add(a,b);
    }

}
