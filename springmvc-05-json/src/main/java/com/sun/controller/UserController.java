package com.sun.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sun.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class UserController {
//    @RequestMapping(value="/j1",produces ="application/json;charset=utf-8")
    @ResponseBody
    @RequestMapping("/j1")
    public String json1(){
        User user = new User("张三阿萨斯大声的哭了", 15, "男");
        ObjectMapper mapper = new ObjectMapper();
        String str = null;
        try {
            str = mapper.writeValueAsString(user);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(user.toString());
        System.out.println(str);
        return str;
    }

    @ResponseBody
    @RequestMapping("/j2")
    public String json2(){
        List<User> list = new ArrayList<User>();
        User user1 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user2 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user3 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user4 = new User("张三阿萨斯大声的哭了", 15, "男");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        ObjectMapper mapper = new ObjectMapper();
        String str = null;
        try {
            str = mapper.writeValueAsString(list);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(str.toString());
        System.out.println(str);
        return str;
    }


    @ResponseBody
    @RequestMapping("/j3")
    public String json3(){
        ObjectMapper mapper = new ObjectMapper();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);
        String str = null;
        try {
            str = mapper.writeValueAsString(new Date());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        System.out.println(str.toString());
        System.out.println(str);
        return str;
    }



    @ResponseBody
    @RequestMapping("/j4")
    public String json4(){
        List<User> list = new ArrayList<User>();
        User user1 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user2 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user3 = new User("张三阿萨斯大声的哭了", 15, "男");
        User user4 = new User("张三阿萨斯大声的哭了", 15, "男");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        return JSON.toJSONString(list);
    }
}
