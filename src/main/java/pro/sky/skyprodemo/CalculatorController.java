package pro.sky.skyprodemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
@GetMapping
public String HelloCalculator(){
    return "Добро пожаловать в калькулятор";
}
@GetMapping(path = "/pl")
    public int calculatorPlus(@RequestParam(name = "num1")int num1,@RequestParam(name = "num2")int num2){
        return num1 + num2;
    }
    @GetMapping(path = "/mi")
    public int calculatorMinus(@RequestParam(name = "num1")int num1,@RequestParam(name = "num2")int num2){
        return num1 - num2;
    }
    @GetMapping(path = "/my")
    public int calculatorMultiply(@RequestParam(name = "num1")int num1,@RequestParam(name = "num2")int num2){
        return num1 * num2;
    }
    @GetMapping(path = "/di")
    public int calculatorDivide(@RequestParam(name = "num1")int num1,@RequestParam(name = "num2")int num2){
        return num1 / num2;
    }
}
