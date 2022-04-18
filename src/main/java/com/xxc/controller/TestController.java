package com.xxc.controller;

import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiangcheng
 * @version 2022/4/18 20:58
 * @since JDK8
 */
@Controller
@RequestMapping("/test")
public class TestController {
    @RequestMapping("/add")
    public String test(){
        return "add_ueditor";
    }

    @RequestMapping("/addContent")
    public String addContent(String description,String content){
        System.out.println("description = " + description);
        System.out.println("content = " + content);
        return "ueditor_detail";
    }
}
