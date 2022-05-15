package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName HelloController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/8 17:22
 **/
@Controller
public class HelloController {

    @RequestMapping( "/")
    public String index(){
        //返回视图名称
        return "index";
    }

    @RequestMapping("/target")
    public String toTarget(){
        return "target";
    }
}
