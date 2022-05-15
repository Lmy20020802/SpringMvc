package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName JsController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/9 16:21
 **/
@Controller
public class JspController {
    @RequestMapping("/success")
    public String success(){
        return "success";
    }
}
