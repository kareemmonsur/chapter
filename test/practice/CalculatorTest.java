package practice;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator casio;

    @BeforeEach
    void setUp() {
        casio= new Calculator(false);
        casio.powerButton();
    }

    @AfterEach
    void tearDown() {
    }
    @Test
    void testCalculatorIsOn(){

        assertEquals(true,casio.getIsOn());
        casio.powerButton();
        assertEquals(false,casio.getIsOn());
    }
    @Test
    void calculatorCanAdd(){

        casio.addition(3,6);
        assertEquals(9, casio.getSum());
    }

    @Test
    void calculatorCanSubtract() {
     casio.subtract(6, 3);
     assertEquals(3,casio.getMinus());
    }
    @Test
    void calculatorCanMultiply() {
        casio.multiply(6, 3);
        assertEquals(18,casio.getTimes());
    }
    @Test
    void calculatorCanDivide() {
        casio.divide(6, 3);
        assertEquals(2,casio.getCut());
    }
}