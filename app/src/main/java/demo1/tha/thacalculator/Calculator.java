package demo1.tha.thacalculator;

public class Calculator {
    public double addplus(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    public double sub(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    public double mul(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    public double div(double firstOperand, double secondOperand) {
        if (secondOperand == 0){
            throw new DivideByZeroException();
        }
        return firstOperand / secondOperand;
    }
}