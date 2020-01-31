package com.learning.springboot.web.controller;

import com.learning.springboot.web.service.LoginService;
import com.learning.springboot.web.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name")
public class LoginController {

    @Autowired
    LoginService loginService;

    @RequestMapping(value="/login", method = RequestMethod.GET)
    public String loginMessage(ModelMap modelMap){
        return "login";
    }
    @RequestMapping(value="/login", method = RequestMethod.POST)
    public String welcomeMessage(ModelMap modelMap, @RequestParam String name, @RequestParam String password){
        boolean isValidUser = loginService.validateUser(name, password);
        if (!isValidUser){
            modelMap.put("errorMessage", "Invalid Credentials. Please try again");
            return "login";
        }else{
            modelMap.put("name", name);
            return "welcome";
        }

    }
}
