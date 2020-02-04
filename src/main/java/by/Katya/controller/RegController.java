package by.Katya.controller;

import by.Katya.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping(path = "/reg")
public class RegController {
    @Autowired
    private List<User> userList;

    @GetMapping
    public ModelAndView mainReg(ModelAndView modelAndView) {
        modelAndView.setViewName("reg");
        modelAndView.addObject("newUser", new User());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView reg(@Valid @ModelAttribute("newUser") User user,
                            BindingResult bindingResult, ModelAndView modelAndView) {
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("reg");
        } else {
            userList.add(user);
            System.out.println("reg");
            modelAndView.setViewName("redirect:/auth");
        }
        return modelAndView;
    }
}
