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
public class TodoController {
    @Autowired
    TodoService todoService;

    @RequestMapping(value="/list-todos", method = RequestMethod.GET)
    public String showTodoList(ModelMap modelMap){
        String name = (String) modelMap.get("name");
        modelMap.put("todos", todoService.retrieveTodos(name));
        return "list-todos";
    }
}
