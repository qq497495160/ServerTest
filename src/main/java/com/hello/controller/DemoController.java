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

@RestController
@RequestMapping("/demo")
public class DemoController {

    @RequestMapping("/getDemo")
    public DemoBean getDemo(){
       DemoBean demo = new DemoBean();
       demo.setId(1);
       demo.setName("Angel");
       return demo;
    }
}
