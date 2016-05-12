package demo1.tha.thacalculator;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.List;

import static junit.framework.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorSubTest {

    private double firstOperand;
    private double secondOperand;
    private double expectedResult;

    Calculator calculator = new Calculator();

    @Test
    public void sub() {
        assertEquals(this.expectedResult, calculator.sub(this.firstOperand, this.secondOperand));
    }

    public CalculatorSubTest(double firstOperand, double secondOperand, double expectedResult) {
        this.firstOperand = firstOperand;
        this.secondOperand = secondOperand;
        this.expectedResult = expectedResult;
    }

    @Parameters
    public static List<Object[]> xxx() {
        return Arrays.asList(new Object[][] {
            {1, 1, 0.0},
            {2, 1, 1.0},
            {8, 2, 6.0},
        });
    }
}