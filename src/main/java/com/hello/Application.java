package com.hello.controller;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;
import com.hello.config.DBSettings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@Controller
@EnableAutoConfiguration
//@MapperScan("com.hello.controller")
@ComponentScan(value = {"com.hello.controller"})  //方法一:http://blog.csdn.net/goodelephant/article/details/52160974
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
