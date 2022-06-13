import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before(){
        calculator = new Calculator(3, 4);
    }

    @Test
    public void hasNumber1(){
        assertEquals(3, calculator.getNumber1());
    }

    @Test
    public  void  changeNumber(){
        int inputNumber = 5;
        assertEquals(5, calculator.setNumber1(inputNumber));
    }

    @Test
    public void addNumber(){
        assertEquals(7, calculator.addNumber());
    }

    @Test
    public void addChangedNumbers(){
        int inputNumber1 = 2;
        int inputNumber2 = 8;
        calculator.setNumber1(inputNumber1);
        calculator.setNumber2(inputNumber2);
        assertEquals(10, calculator.addNumber());
    }

    @Test
    public void  subtractNumbers(){
        int inputNumber1 = 6;
        int inputNumber2 = 3;
        calculator.setNumber1(inputNumber1);
        calculator.setNumber2(inputNumber2);
        assertEquals(3, calculator.subtractNumber());
    }
    @Test
    public void  divideNumbers(){
        int inputNumber1 = 6;
        int inputNumber2 = 3;
        calculator.setNumber1(inputNumber1);
        calculator.setNumber2(inputNumber2);
        assertEquals(2, calculator.divideNumber(), 0.0);
    }

}
