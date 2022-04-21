package com.xxc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author xiangcheng
 * @version 2022/4/18 20:58
 * @since JDK8
 */
@Controller
@RequestMapping("/test")
public class TestController {
    private String context;

    @RequestMapping("/add")
    public String test(){
        return "add_ueditor";
    }

    @RequestMapping("/addContent")
    public String addContent(String description,String content){
        System.out.println("description = " + description);
        System.out.println("content = " + content);
        context = content;
        return "redirect:/test/detail";
    }

    @RequestMapping("/detail")
    public String detail(Model model){
        model.addAttribute("content",context);
        return "ueditor_detail";
    }
}
