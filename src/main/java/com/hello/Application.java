package com.hello.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.hello.config.DBSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Controller
@EnableAutoConfiguration
public class Application {
    protected static Logger logger=LoggerFactory.getLogger(Application.class);

    @RequestMapping("/")
    String home() {
        logger.debug("访问home");
        System.out.println("cao!!!");
        return "haha.html";
    }


    @RequestMapping("/best")
    @ResponseBody
    public String best() {
        return "best 界面";
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }
}
