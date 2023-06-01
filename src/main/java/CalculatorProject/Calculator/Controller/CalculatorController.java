package CalculatorProject.Calculator.Controller;

import CalculatorProject.Calculator.Model.Calculator;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class CalculatorController {

    @GetMapping("add")
    public int getAddition(@RequestParam int a, @RequestParam int b){
        Calculator calculator = new Calculator();
        return calculator.add(a, b);
    }
    @GetMapping("subtract")
    public int getDifference(@RequestParam int a, @RequestParam int b){
        Calculator calculator=new Calculator();
        return calculator.subtract(a,b);
    }
    @GetMapping("multiply")
    public int getProduct(@RequestParam int a,@RequestParam int b){
        Calculator calculator=new Calculator();
        return calculator.multiply(a,b);
    }
    @GetMapping("divide")
    public int getDivision(@RequestParam int a,@RequestParam int b){
        Calculator calculator=new Calculator();
        return calculator.divide(a,b);
    }
}
