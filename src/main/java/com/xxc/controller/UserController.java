package com.xxc.controller;

import com.xxc.bean.User;
import com.xxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author xiangcheng
 * @version 2022/4/18 13:08
 * @since JDK8
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/user/{id}")
    public String getUser(@PathVariable("id")Integer id){
        User user = userService.getUser(id);
        System.out.println("user = " + user);
        return "success";
    }

    @RequestMapping("/users/{id}")
    @ResponseBody
    public User getById(@PathVariable("id")Integer id){
        return userService.getUser(id);
    }

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/test")
    public String testController(){
        return "ueditorTest";
    }

}
