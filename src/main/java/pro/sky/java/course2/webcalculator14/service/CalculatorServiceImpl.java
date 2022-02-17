package pro.sky.java.course2.webcalculator14.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    private float number1;
    private float number2;

    public CalculatorServiceImpl() {
    }

    public void setNumber1(float number1) {
        this.number1 = number1;
    }

    public void setNumber2(float number2) {
        this.number2 = number2;
    }

    @Override
    public String sum() {
        float result = number1 + number2;
        return Float.toString(result);
    }

    @Override
    public String difference() {
        float result = number1 - number2;
        return Float.toString(result);
    }

    @Override
    public String multiple() {
        float result = number1 * number2;
        return Float.toString(result);
    }

    @Override
    public String divide() {
        float result = number1 / number2;
        return Float.toString(result);
    }
}
