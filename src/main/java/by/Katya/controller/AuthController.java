package by.Katya.controller;

import by.Katya.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping(path = "/auth")
public class AuthController {

    @Autowired
    private List<User> userList;

    @GetMapping
    public ModelAndView mainAuth(ModelAndView modelAndView) {
        modelAndView.setViewName("auth");
        modelAndView.addObject("currentUser", new User());
        return modelAndView;
    }

    @PostMapping
    public ModelAndView auth (@Valid @ModelAttribute("currentUser") User user,
                            BindingResult bindingResult, ModelAndView modelAndView, HttpSession httpSession) {
        if (bindingResult.hasErrors()) {
            modelAndView.setViewName("auth");
            System.out.println("auth1");
        } else {
            if (userList.contains(user)) {
                for (User user1 : userList) {
                    if (user1.equals(user)) {

                        httpSession.setAttribute("currentUser", user1);
                        httpSession.setAttribute("history", new ArrayList<>());

                    }
                }
                modelAndView.setViewName("redirect:/main");
            } else {
                for (User user1 : userList) {
                    if (user1.getLogin() != (user.getLogin())) {
                        String messageLogin = "Вы неверно ввели логин";
                        modelAndView.addObject("message", messageLogin);
                        System.out.println("auth3");
                        modelAndView.setViewName("redirect:/auth");
                    }
                    if (user1.getPassword() != (user.getPassword())) {
                        String messagePassword = "Вы неверно ввели пароль";
                        modelAndView.addObject("message", messagePassword);
                        System.out.println("auth4");
                        modelAndView.setViewName("redirect:/auth");
                    }
                }
            }
        }
        return modelAndView;
    }
}


