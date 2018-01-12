package com.wisn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mvc")
public class MvcController {

    @RequestMapping("/hello")
    public String hello(){
        System.out.println("hahahah");
        return "hello";
    }
}
