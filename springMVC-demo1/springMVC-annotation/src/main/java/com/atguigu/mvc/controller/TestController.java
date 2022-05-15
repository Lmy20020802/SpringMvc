package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/10 19:53
 **/
@Controller
public class TestController {
    @RequestMapping("/")
    public String index(){
        return "index";
    }
}
