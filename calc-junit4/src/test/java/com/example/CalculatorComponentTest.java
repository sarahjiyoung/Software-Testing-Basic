package com.example;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorComponentTest {
    private Calculator calc;

    @Before
    public void setUp() { calc = new Calculator(); }

    // add
    @Test public void add_twoPositives_returnsSum() {
        assertEquals(9,  calc.add(4,5));
    }
    @Test public void add_withZero_returnsSameNumber() {
        assertEquals(7,  calc.add(7,0));
    }
    @Test public void add_twoNegatives_returnsNegativeSum() {
        assertEquals(-9, calc.add(-4,-5));
    }

    // subtract
    @Test public void subtract_twoPositives_returnsDifference() {
        assertEquals(1,  calc.subtract(6,5));
    }
    @Test public void subtract_resultNegative_whenSecondGreater() {
        assertEquals(-3, calc.subtract(2,5));
    }
    @Test public void subtract_withZero_returnsSameNumber() {
        assertEquals(10, calc.subtract(10,0));
    }

    // multiply
    @Test public void multiply_twoPositives_returnsProduct() {
        assertEquals(20, calc.multiply(4,5));
    }
    @Test public void multiply_withZero_returnsZero() {
        assertEquals(0, calc.multiply(123,0));
        assertEquals(0, calc.multiply(0,999));
    }
    @Test public void multiply_negativeAndPositive_returnsNegative() {
        assertEquals(-12, calc.multiply(-3,4));
    }

    // divide
    @Test public void divide_exactDivision_returnsQuotient() {
        assertEquals(3,  calc.divide(15,5));
    }
    @Test public void divide_negativeDividend_returnsNegative() {
        assertEquals(-4, calc.divide(-12,3));
    }
    @Test(expected = IllegalArgumentException.class)
    public void divide_zeroDivisor_throwsIAE() {
        calc.divide(10,0);
    }
}
