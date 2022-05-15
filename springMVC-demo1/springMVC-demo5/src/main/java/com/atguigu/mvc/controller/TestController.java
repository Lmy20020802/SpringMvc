package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/10 14:51
 **/
@Controller
public class TestController {

    @RequestMapping("/**/testInterceptor")
    public String testInterceptor(){
        return "success";
    }

    @RequestMapping("/testExceptionHanler")
    public String testExceptionHandler(){
        System.out.println(1/0);
        return  "success";
    }
}
