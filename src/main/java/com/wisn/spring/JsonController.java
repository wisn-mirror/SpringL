package com.wisn.spring;
import com.wisn.spring.model.Test;
import com.wisn.spring.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
@RequestMapping("/json")
public class JsonController {

    /**
     *
     * @param nihao
     * @param name
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/user",method = RequestMethod.POST)
    public User hello(@RequestParam(value = "aab") Integer nihao, @RequestParam(value = "ccb") String name) {
        System.out.println("hello3:" + nihao+" "+name);
        User user=new User();
        user.setName(name);
        user.setUserid(nihao);
        user.setData(new Date());
        user.setTest(new Test());
        return user;
    }


}
