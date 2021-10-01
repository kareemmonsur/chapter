package practice;

import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OperatorTest {
    //Operator myOperator = new Operator();
    @Test
    public void operatorCanPerformAdditionTest(){
        Operator myOperator = new Operator();
        myOperator.add(5,6);
        myOperator.getSum();
        assertEquals(11,myOperator.getSum());
    }
    @Test
    public void operatorCanPerformMultiplicationTest(){
        Operator myOperator = new Operator();
        myOperator.multiply(2,2);
        myOperator.getProduct();
        assertEquals(4, myOperator.getProduct());


    }
}
