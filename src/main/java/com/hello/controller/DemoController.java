package com.hello.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hello.bean.DemoBean;

@RestController//页面用Controller //Gson用RestController
//@SpringBootApplication //方法二:http://blog.csdn.net/goodelephant/article/details/52160974
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public DemoBean getDemo(){
       DemoBean demo = new DemoBean();
       demo.setId(1);
       demo.setName("Angel");
       return demo;
    }


    @RequestMapping("/shit")
    private String shit() {
        System.out.println("cao!!!");
        return "/haha.html";
    }
// 方法二:http://blog.csdn.net/goodelephant/article/details/52160974
//    public static void main( String[] args ) {  
//        System.out.println( "Hello World!" );  
//        SpringApplication.run(DemoController.class, args);  
//    }  
}
