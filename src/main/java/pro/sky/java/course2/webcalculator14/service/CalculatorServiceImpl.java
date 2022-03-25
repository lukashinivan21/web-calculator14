package pro.sky.java.course2.webcalculator14.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int difference(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiple(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public float divide(int num1, int num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Введено не корректное число");
        }
        return (float) num1 / num2;
    }
}
