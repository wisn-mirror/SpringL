package com.wisn.spring;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc2")
public class MvcController1 {

    /**
     * http://localhost:8080/mvc2/hello4?aab=333&ccb=22222
     * @param nihao
     * @param name
     * @return
     */
    @RequestMapping(value = "/hello4")
    public String hello(@RequestParam(value = "aab") Integer nihao,@RequestParam(value = "ccb") String name) {
        System.out.println("hello3:" + nihao+" "+name);
        return "hello";
    }

    @ExceptionHandler
    public ModelAndView  exceptionHandler(Exception ex){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("exception",ex);
        System.out.println(" exception");
        return modelAndView;
    }

    @RequestMapping("/error")
    public String error(){
        int i=5/0;
        return "hello";
    }

}
