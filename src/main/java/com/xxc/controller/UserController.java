package com.xxc.controller;

import com.xxc.bean.Result;
import com.xxc.bean.User;
import com.xxc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author xiangcheng
 * @version 2022/4/18 13:08
 * @since JDK8
 */
@Controller
public class UserController {
    @Autowired
    UserService userService;



    @RequestMapping("/login")
    public String getUser() {
        return "user/login";
    }

    @RequestMapping("/checklogin")
    @ResponseBody
    public Result checklogin(User user, HttpSession session) {
//        System.out.println("user = " + user);
        boolean b = userService.checkLogin(user.getUserName(), user.getPassword());
        Result result = new Result("fail", "失败");
        if (b) {
            session.setAttribute("logininfo",user);
            return new Result("success", "成功");
        }
        return result;
    }

}
