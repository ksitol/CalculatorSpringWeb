package by.Katya.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping(path = "/main")

public class MainController {
    @GetMapping
    public ModelAndView mainMain (ModelAndView modelAndView) {
        modelAndView.setViewName("main");
        String message = "Добро пожаловать!";
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @PostMapping
    public ModelAndView main (ModelAndView modelAndView) {
       return modelAndView;
    }

}
