package pro.sky.java.course2.webcalculator14;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.webcalculator14.service.CalculatorService;
import pro.sky.java.course2.webcalculator14.service.CalculatorServiceImpl;

import java.util.stream.Stream;

public class CalculatorServiceImplParameterizedTest {

    private final CalculatorService out = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("numbersForTests")
    public void calculateSum(int number1, int number2) {
        int expected = out.sum(number1, number2);
        int actual = number1 + number2;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numbersForTests")
    public void calculateDifference(int number1, int number2) {
        int expected = out.difference(number1, number2);
        int actual = number1 - number2;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numbersForTests")
    public void calculateMultiple(int number1, int number2) {
        int expected = out.multiple(number1, number2);
        int actual = number1 * number2;
        Assertions.assertEquals(expected, actual);
    }

    @ParameterizedTest
    @MethodSource("numbersForTests")
    public void calculateDivide(int number1, int number2) {
        float expected = out.divide(number1, number2);
        float actual = (float) number1 / number2;
        Assertions.assertEquals(expected, actual);
    }


    public static Stream<Arguments> numbersForTests() {
        return Stream.of(
                Arguments.of(25, 16),
                Arguments.of(-10, 6),
                Arguments.of(23, 57),
                Arguments.of(-15, -65)
        );
    }
}
