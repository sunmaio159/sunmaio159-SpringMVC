package com.sun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RestFulController {

    //https://www.bilibili.com/video/BV1aE41167Tu?p=10 原来的
    //http://localhost:8080/springmvc_04_controller/test1/1/3 RESTFUL风格
//    @RequestMapping(value="/test1/{a}/{b}",method = RequestMethod.GET)
    @GetMapping("/test1/{a}/{b}")
    public String test1(@PathVariable int a, @PathVariable int b, Model model){
        int res = a+b;
        model.addAttribute("msg","结果为"+res);
        return "test";
    }
}
