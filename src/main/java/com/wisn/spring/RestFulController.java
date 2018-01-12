package com.wisn.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/restful")
public class RestFulController {

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public String get(@PathVariable("id") Integer id, @RequestParam(value = "data")String data) {
        System.out.println("GET:" + id+"   "+data);
        return "hello";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.POST)
    public String post(@PathVariable("id") Integer id, @RequestParam(value = "data")String data) {
        System.out.println("POST:" + id+"   "+data);
        return "hello";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.PUT)
    public String put(@PathVariable("id") Integer id, @RequestParam(value = "data")String data) {
        System.out.println("PUT:" + id+"   "+data);
        return "hello";
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.DELETE)
    public String delete(@PathVariable("id") Integer id, @RequestParam(value = "data")String data) {
        System.out.println("DELETE:" + id+"   "+data);
        return "hello";
    }
}
