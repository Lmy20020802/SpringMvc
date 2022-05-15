package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName ViewController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/9 15:05
 **/
@Controller
public class ViewController {

    @RequestMapping("/testThymeleafView")
    public String testThymeleafView(){
        return  "success";
    }

    @RequestMapping("/testForward")
    public String testForward(){
        return "forward:/testThymeleafView";
    }

    @RequestMapping("/testRedirect")
    public String testRedirect(){
        return "redirect:/testThymeleafView";
    }
}
