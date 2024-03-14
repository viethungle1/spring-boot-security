package com.example.secondspringboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class DemoController {
    @GetMapping("/home")
    public ModelAndView modelAndView () {
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
    @GetMapping("/admin")
    public ModelAndView modelAndView1 () {
        ModelAndView modelAndView = new ModelAndView("admin");
        return modelAndView;
    }
    @GetMapping("/user")
    public ModelAndView modelAndView2 () {
        ModelAndView modelAndView = new ModelAndView("user");
        return modelAndView;
    }
}
