import Arithmetics.Arithmetics;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArithmeticsTestTest {

   @Test
   public void testThatTwoNumbersCanAdd() {
      //given
      int firstNumber = 12;
      int secondNumber = 10;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.add(firstNumber, secondNumber);
      //assert
      assertEquals(22, arithmetics.getAdd());
   }

   @Test
   public void testThatTwoNumbersCanSubtract() {
      //given
      int firstNumber = 12;
      int secondNumber = 10;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.subtract(firstNumber, secondNumber);
      //assert
      assertEquals(2, arithmetics.getSubtract());
   }

   @Test
   public void testThatTwoNumbersCanMultiply() {
      //given
      int firstNumber = 2;
      int secondNumber = 3;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.multiply(firstNumber, secondNumber);
      //assert
      assertEquals(6, arithmetics.getMultiply());
   }

   @Test
   public void testThatTwoNumbersCanDivide() {
      //given
      int firstNumber = 8;
      int secondNumber = 2;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.divide(firstNumber, secondNumber);
      //assert
      assertEquals(4, arithmetics.getDivide());
   }

   @Test
   public void testThatTwoNumbersCanMod() {
      //given
      int firstNumber = 5;
      int secondNumber = 2;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.mod(firstNumber, secondNumber);
      //assert
      assertEquals(1, arithmetics.getMod());
   }
   @Test
   public void testThatFindsMinOfTwoNumbers(){
      //given
      int firstNumber = 1;
      int secondNumber = 3;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.min(firstNumber, secondNumber);
      //assert
      assertEquals(1, arithmetics.getMin());

   }
   @Test
   public void testThatFindsMaxOfTwoNumbers(){
      //given
      int firstNumber = 2;
      int secondNumber = 3;
      Arithmetics arithmetics = new Arithmetics();
      //when
      arithmetics.max(firstNumber, secondNumber);
      //assert
      assertEquals(3, arithmetics.getMax());

   }
}