package com.stackroute.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller //Used to mark any Java class as a Controller class
public class UserController
{
    @RequestMapping("/") //Used to map Spring MVC controller methods.
    public ModelAndView modelAndView()
    {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("result","Shailesh");
        System.out.println("coming");
        modelAndView.setViewName("result");
        return modelAndView;
    }
}
