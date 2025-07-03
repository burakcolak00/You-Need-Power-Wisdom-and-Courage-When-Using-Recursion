package org.example;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class TriangleNumberCalculatorTest {
    TriangleNumberCalculator calculator = new TriangleNumberCalculator();
    @Test
    void testValue() {
        assertEquals(1, calculator.value(1)); // This should print out 1
        assertEquals(3, calculator.value(2)); // This should print out 3
        assertEquals(10, calculator.value(4)); // This should print out 10
        assertEquals(-1, calculator.value(0)); // This should print out -1
        assertEquals(-1, calculator.value(-1)); // This should print out -1
    }

    @Test
    void testAdd() {
        assertEquals(2, calculator.add(1, 1)); // This should print out 2
        assertEquals(9, calculator.add(2, 3)); // This should print out 9
        assertEquals(13, calculator.add(4, 2)); // This should print out 13
        assertEquals(-1, calculator.add(-1, 1)); // This should print out -1
        assertEquals(-1, calculator.add(1, -1)); // This should print out -1
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(1, 1)); // This should print out 0
        assertEquals(-3, calculator.subtract(2, 3)); // This should print out -3
        assertEquals(7, calculator.subtract(4, 2)); // This should print out 7
        assertEquals(-1, calculator.subtract(-1, 1)); // This should print out -1
        assertEquals(-1, calculator.subtract(1, -1)); // This should print out -1
    }

    @Test
    void testMultiply() {
        assertEquals(1, calculator.multiply(1, 1)); // This should print out 1
        assertEquals(18, calculator.multiply(2, 3)); // This should print out 18
        assertEquals(30, calculator.multiply(4, 2)); // This should print out 20
        assertEquals(-1, calculator.multiply(-1, 1)); // This should print out -1
        assertEquals(-1, calculator.multiply(1, -1)); // This should print out -1
    }

    @Test
    void testDivide() {
        assertEquals(1.0, calculator.divide(1, 1)); // This should print out 1.0
        assertEquals(2.0, calculator.divide(3, 2)); // This should print out 1.5
        assertEquals(10/3, calculator.divide(4, 2)); // This should print out 10/3
        assertEquals(-1, calculator.divide(-1, 1)); // This should print out -1
        assertEquals(-1, calculator.divide(1, -1)); // This should print out -1
        assertEquals(-1, calculator.divide(1, 0)); // This should print out -1
    }

    @Test
    void testDivideByZero() {
        assertEquals(-1, calculator.divide(1, 0)); // This should print out -1
        assertEquals(-1, calculator.divide(0, 0)); // This should print out -1
    }
}
