package com.sun.controller;

import com.sun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/user")
public class UserController {
    @GetMapping("/t1")
    public String test1(@RequestParam("username") String name, Model model){
        //1.节后前端参数
        System.out.println("name="+name);
        //2.返回结果给前端
        model.addAttribute("msg",name);
        //视图跳转
        return "test";
    }

    @GetMapping("/t2")
    public String test2(User user){
        System.out.println(user);
        return "test";
    }
}
