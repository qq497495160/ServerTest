package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@SpringBootApplication
@Controller
@EnableAutoConfiguration
@ComponentScan
// @ComponentScan(value = {"com.hello.controller","com.hello.dao"})
// 方法一:http://blog.csdn.net/goodelephant/article/details/52160974
public class SpringBootTestApplication {

    @RequestMapping("/")
    String home() {
        System.out.println("cao!!!");
        return "haha.html";
    }

    @RequestMapping("/best")
    @ResponseBody
    public String best() {
        return "best 界面";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTestApplication.class, args);
    }
}
