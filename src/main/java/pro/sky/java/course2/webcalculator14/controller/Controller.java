package pro.sky.java.course2.webcalculator14.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.webcalculator14.service.CalculatorService;

@RestController
@RequestMapping("/calculator")
public class Controller {

    private final CalculatorService calculatorService;

    public Controller(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }

    @GetMapping()
    public String greeting() {
        return "Добро пожаловать в калькулятор!";
    }

    @GetMapping("/plus")
    public String sum(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " + " + num2 + " = " + calculatorService.sum(num1, num2);
    }

    @GetMapping("/minus")
    public String difference(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " - " + num2 + " = " + calculatorService.difference(num1, num2);
    }

    @GetMapping("/multiple")
    public String multiple(@RequestParam String num1, @RequestParam String num2) {
        return num1 + " * " + num2 + " = " + calculatorService.multiple(num1, num2);
    }

    @GetMapping("/divide")
    public String divide(@RequestParam String num1, @RequestParam String num2) {
        if (num2.equals("0")) {
            return "Введено не корректное число";
        } else {
            return num1 + " / " + num2 + " = " + calculatorService.divide(num1, num2);
        }
    }
}
