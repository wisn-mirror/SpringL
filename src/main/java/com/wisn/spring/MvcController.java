package com.wisn.spring;

import com.wisn.spring.model.User;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/mvc")
public class MvcController {

    /**
     * 自动匹配参数
     *http://localhost:8080/mvc2/hello1?name=333&age=22222&id=3333
     * @param name
     * @param age
     * @param id
     * @return
     */
    @RequestMapping("/hello1")
    public String hello(String name, String age, int id) {
        System.out.println("hello1:" + name + " " + age + " " + id);
        return "hello";
    }

    @RequestMapping("/hello2")
    public String hello(User user) {
        System.out.println("hello2:" + user.getName() + " " + user.getUserid() + " " + System.currentTimeMillis());
        return "hello";
    }

    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest req) throws Exception {
        MultipartHttpServletRequest mreq = (MultipartHttpServletRequest) req;
        MultipartFile file = mreq.getFile("file");
        String fileName = file.getOriginalFilename();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");
        String path = req.getSession().getServletContext().getRealPath("/") +
                "upload/";
        File tempfile = new File(path);
        if (!tempfile.exists()) {
            tempfile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream(path + sdf.format(new Date()) + fileName.substring(fileName.lastIndexOf('.')));
        fos.write(file.getBytes());
        fos.flush();
        fos.close();

        return "hello";
    }

    @RequestMapping("/hello3")
    public String hello(@RequestParam(value = "date") Date date) {
        System.out.println("hello3:" + date);
        return "hello";
    }


    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        binder.registerCustomEditor(Date.class, new CustomDateEditor(new SimpleDateFormat("yyyy-MM-dd"), true));
    }
}
