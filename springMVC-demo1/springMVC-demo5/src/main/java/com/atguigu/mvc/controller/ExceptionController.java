package com.atguigu.mvc.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * @ClassName ExceptionController
 * @Description TODO
 * @Author lmy
 * @Date 2022/4/10 16:32
 **/
@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(value = {ArithmeticException.class,NullPointerException.class})
    public String testException(Exception ex,Model model){
        model.addAttribute("ex",ex);
        return "error";
    }
}
