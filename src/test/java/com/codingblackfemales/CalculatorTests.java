package com.codingblackfemales;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName(value = "The Calculator should")
public class CalculatorTests {

    @Test
    @DisplayName("add two numbers")
    public void testAddition() {
        final Integer sum = Calculator.add(2, 4);

        assertEquals(6, sum);
    }

    @Test
    @DisplayName("subtract two numbers")
    public void testSubtraction() {
        final Integer difference = Calculator.subtract(2, 4);

        assertEquals(-2, difference);
    }

    @Test
    @DisplayName("multiply two numbers")
    public  void testMultiplication(){
    final Integer multiply = Calculator.multiply(3,5);
    assertEquals(15, multiply);
    }

    @Test
    @DisplayName("Multiply a negative number with a positive number")
    public void test1NegNumMultiplied(){
        final Integer multiplyAgainstANeg = Calculator.multiply(-2,5);
        assertEquals(-10,multiplyAgainstANeg);
    }

    @Test
    @DisplayName("Multiply a negative number with another negative number")
    public void test2NegNumMultiplied(){
        final Integer multiplyAgainstNegs = Calculator.multiply(-2,-5);
        assertEquals(-10,multiplyAgainstNegs);
    }

    @Test
    @DisplayName("Divide two numbers")
    public void testDivide(){
      final Integer divide = Calculator.divide(2,2);
      assertEquals(1, divide);
    }

    @Test
    @DisplayName("Divide by zero")
    public void testDividebyZero(){
        final Integer dividebyZero = Calculator.divide(2,0);
//        assertThrows(ArithmeticException.class, ()-> 0, dividebyZero);
    }


}
