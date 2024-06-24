package com.example.Demo_Labboration3_Omar;

import org.junit.jupiter.api.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.BeforeEach;

@SpringBootTest
@DisplayName("Test of Calculator")
public class CalculatorTests {

    Calculator calculator;

    @BeforeEach
    void beforeTests() {
        System.out.println("En enskild testmetod för Kalkulator kommer att köras.");
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition av två tal ska returnera dess summa")
    void addingTwoNumbersShouldReturnSix() {
        int a = 4;
        int b = 2;
        int result = calculator.add(a, b);
        int expectedResult = 6;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Addition av två tal ska inte returnera dess summa")
    void addingTwoNumbersShouldNotReturnSix() {
        int a = 6;
        int b = 1;
        int result = calculator.add(a, b);
        int expectedResult = 6;
        Assertions.assertNotEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtraktion av tre tal ska returnera dess summa")
    void subtractTwoNumbersShouldReturnFour() {
        int a = 9;
        int b = 3;
        int c = 2;
        int result = calculator.subtract(a, b, c);
        int expectedResult = 4;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Subtraktion av två tal ska inte returnera dess summa")
    void subtractTreeNumbersShouldNotReturnFour() {
        int a = 12;
        int b = 7;
        int c = 3;
        int result = calculator.subtract(a, b, c);
        int expectedResult = 4;
        Assertions.assertNotEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplikation av två tal ska returnera dess summa")
    void multiplyTwoNumbersShouldReturnTwentyone() {
        int a = 7;
        int b = 3;
        int result = calculator.multiply(a, b);
        int expectedResult = 21;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Multiplikation av två tal ska inte returnera dess summa")
    void multiplyTwoNumbersShouldNotReturnTwentyone() {
        int a = 6;
        int b = 3;
        int result = calculator.multiply(a, b);
        int expectedResult = 21;
        Assertions.assertNotEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Division av två tal ska returnera dess summa")
    void divideTwoNumbersShouldReturnTree() {
        int a = 9;
        int b = 3;
        double result = calculator.divide(a, b);
        int expectedResult = 3;
        Assertions.assertEquals(expectedResult, result);
    }

    @Test
    @DisplayName("Division av två tal ska inte returnera dess summa")
    void divideTwoNumbersShouldNotReturnTree() {
        int a = 10;
        int b = 2;
        double result = calculator.divide(a, b);
        int expectedResult = 3;
        Assertions.assertNotEquals(expectedResult, result);
    }
}
