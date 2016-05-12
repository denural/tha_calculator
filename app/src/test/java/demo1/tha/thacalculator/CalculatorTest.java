package demo1.tha.thacalculator;

import org.junit.Ignore;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class CalculatorTest {


    @Test public void
    OneAddOneEqualTwo(){
        //Act
        //Assert
        assertEquals(2.0, new Calculator().addplus(1, 1));
    }

    @Test public void
    Minus(){
        //Act
        //Assert
        assertEquals(0.0, new Calculator().sub(1, 1));
        assertEquals(1.0, new Calculator().sub(2, 1));
    }

    @Test public void
    OneMulTwoEqualTwo(){
        //Act
        //Assert
        assertEquals(2.0, new Calculator().mul(1, 2));
    }

    @Test public void
    TwoDivOneEqualTwo(){
        //Act
        //Assert
        assertEquals(2.0, new Calculator().div(2, 1));
    }

    @Test (expected = DivideByZeroException.class) public void
    TwoDivZeroEqual_DivideByZeroException(){
        //Act

        assertEquals(DivideByZeroException.class, new Calculator().div(2, 0));
    }
}
