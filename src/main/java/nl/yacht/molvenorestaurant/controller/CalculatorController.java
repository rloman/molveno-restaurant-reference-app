package nl.yacht.molvenorestaurant.controller;

import nl.yacht.molvenorestaurant.model.CalculatorResult;
import nl.yacht.molvenorestaurant.utils.Calculator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CalculatorController {

    @Autowired
    private Calculator calculator; // dit is dus de INTERFACE

    public CalculatorResult addSomeValues(int a, int b) {

        CalculatorResult result = new CalculatorResult();

        int resultFromCalculator = this.calculator.add(a, b);

        result.setA(a);
        result.setB(b);
        result.setOperator("+");
        result.setResult(resultFromCalculator);

        return result;
    }
}
