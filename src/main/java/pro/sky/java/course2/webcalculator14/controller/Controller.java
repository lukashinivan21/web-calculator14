package pro.sky.java.course2.webcalculator14.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webcalculator14.service.CalculatorServiceImpl;

@RestController
@RequestMapping("/calculator")
public class Controller {

    CalculatorServiceImpl calc = new CalculatorServiceImpl();

    @GetMapping()
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    public void converter(String s1, String s2) {
        calc.setNumber1(Float.parseFloat(s1));
        calc.setNumber2(Float.parseFloat(s2));
    }

    @GetMapping("/plus")
    public String sum(@RequestParam String num1, @RequestParam String num2) {
        converter(num1, num2);
        String result = calc.sum();
        return num1 + " + " + num2 + " = " + result;
    }

    @GetMapping("/minus")
    public String difference(@RequestParam String num1, @RequestParam String num2) {
        converter(num1, num2);
        String result = calc.difference();
        return num1 + " - " + num2 + " = " + result;
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam String num1, @RequestParam String num2) {
        converter(num1, num2);
        String result = calc.multiple();
        return num1 + " * " + num2 + " = " + result;
    }

    @GetMapping("/divide")
    public String divide(@RequestParam String num1, @RequestParam String num2) {
        if (num2.equals("0")) {
            return "Введено не корректное число";
        } else {
            converter(num1, num2);
            String result = calc.divide();
            return num1 + " / " + num2 + " = " + result;
        }
    }
}
