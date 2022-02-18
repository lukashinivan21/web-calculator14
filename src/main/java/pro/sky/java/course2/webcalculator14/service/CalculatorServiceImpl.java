package pro.sky.java.course2.webcalculator14.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

    @Override
    public String sum(String s1, String s2) {
        float result = Float.parseFloat(s1) + Float.parseFloat(s2);
        return Float.toString(result);
    }

    @Override
    public String difference(String s1, String s2) {
        float result = Float.parseFloat(s1) - Float.parseFloat(s2);
        return Float.toString(result);
    }

    @Override
    public String multiple(String s1, String s2) {
        float result = Float.parseFloat(s1) * Float.parseFloat(s2);
        return Float.toString(result);
    }

    @Override
    public String divide(String s1, String s2) {
        float result = Float.parseFloat(s1) / Float.parseFloat(s2);
        return Float.toString(result);
    }
}
