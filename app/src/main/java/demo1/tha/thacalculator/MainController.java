package demo1.tha.thacalculator;

public class MainController {

    Calculator calculator = new Calculator();
    CalculatorListener listener;

    public void setListener(CalculatorListener listener) {
        this.listener = listener;
    }

    public void add(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.addplus(firstOperand, secondOperand)));
    }

    public void sub(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.sub(firstOperand, secondOperand)));
    }

    public void mul(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.mul(firstOperand, secondOperand)));
    }

    public void div(double firstOperand, double secondOperand){
        listener.onSuccess(String.valueOf(calculator.div(firstOperand, secondOperand)));
    }
}
