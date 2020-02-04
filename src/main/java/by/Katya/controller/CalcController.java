package by.Katya.controller;

import by.Katya.entity.Calculator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "/calc")
public class CalcController {
    @GetMapping
    public ModelAndView calc (ModelAndView modelAndView){
        modelAndView.setViewName("calc");
        modelAndView.addObject("calculator", new Calculator());
        return  modelAndView;
    }

    @PostMapping
    public ModelAndView calc (@ModelAttribute("calculator") Calculator calculator, ModelAndView modelAndView) {
        double num1 = calculator.getNum1();
        double num2 = calculator.getNum2();
        String action = calculator.getAction();
        double result = 0;
        if (action.equals("sum")) {
            result = calculator.sum();
        }
        if (action.equals("sub")) {
            result = calculator.sub();
        }
        if (action.equals("mult")) {
            result = calculator.mult();
        }
        if (action.equals("div")) {
            result = calculator.div();
        }
        modelAndView.addObject("result", result);
        return modelAndView;
    }


//    public String calculator(@RequestParam("num1") double num1,
//                             @RequestParam("num2") double num2,
//                             @RequestParam("action") String action,
//                             Model model) {
//        double result = 0;
//        if (action.equals("sum")) {
//            result = num1 + num2;
//        }
//        if (action.equals("sub")) {
//            result = num1 - num2;
//        }
//        if (action.equals("mult")) {
//            result = num1 * num2;
//        }
//        if (action.equals("div")) {
//            if (num2 != 0) {
//                result = num1 / num2;
//            }
//        }
//        model.addAttribute("result", result);
//        return "calc";
//    }

}


