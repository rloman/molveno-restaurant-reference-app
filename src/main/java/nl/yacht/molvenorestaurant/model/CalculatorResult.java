package nl.yacht.molvenorestaurant.model;

public class CalculatorResult {

    private int a;
    private int b;

    private String operator;

    private int result;

    public CalculatorResult() {
    }

    public CalculatorResult(int a, int b, String operator, int result) {
        this.a = a;
        this.b = b;
        this.operator = operator;
        this.result = result;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }


}
