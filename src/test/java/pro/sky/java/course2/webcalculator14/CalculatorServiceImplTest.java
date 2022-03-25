package pro.sky.java.course2.webcalculator14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.webcalculator14.service.CalculatorService;
import pro.sky.java.course2.webcalculator14.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorServiceImplTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    private int num1, num2, num3, num4, num5;

    @BeforeEach
    public void setUp() {
        num1 = 12;
        num2 = 5;
        num3 = 0;
        num4 = -6;
        num5 = -14;
    }

    @Test
    public void calculateSumIfNumbersArePositive() {
        int expected = out.sum(num1, num2);
        int actual = num1 + num2;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateSumIfNumbersAreNegative() {
        int expected = out.sum(num4, num5);
        int actual = num4 + num5;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateDifferenceIfNumbersArePositive() {
        int expected = out.difference(num1, num2);
        int actual = num1 - num2;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateDifferenceIfNumbersAreNegative() {
        int expected = out.difference(num4, num5);
        int actual = num4 - num5;
        assertEquals(expected, actual);
    }
    @Test
    public void calculateMultipleIfNumbersArePositive() {
        int expected = out.multiple(num1, num2);
        int actual = num1 * num2;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateMultipleIfNumbersAreNegative() {
        int expected = out.multiple(num4, num5);
        int actual = num4 * num5;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateDivideIfNumbersArePositive() {
        float expected = out.divide(num1, num2);
        float actual = (float) num1 / num2;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateDivideIfNumbersAreNegative() {
        float expected = out.divide(num4, num5);
        float actual = (float) num4 / num5;
        assertEquals(expected, actual);
    }

    @Test
    public void calculateDivideThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> out.divide(num1, num3));
    }
}
