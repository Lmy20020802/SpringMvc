package com.atguigu.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/24 23:30
 **/
@RestController
@Controller
@ResponseBody
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "成功";
    }
}
