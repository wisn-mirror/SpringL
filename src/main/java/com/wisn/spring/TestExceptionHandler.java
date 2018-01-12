package com.wisn.spring;


import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class TestExceptionHandler {

    @ExceptionHandler
    public ModelAndView exceptionHandler(Exception ex){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("exception",ex);
        System.out.println(" all exception");
        return modelAndView;
    }
}
