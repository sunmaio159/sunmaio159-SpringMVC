package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerTest {
    @RequestMapping("/hello")
    public String test(Model model){
        model.addAttribute("msg","asdasdas");
        return "test";
    }
}
