package com.hello.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hello.bean.DemoBean;
import com.hello.service.IUserInfoService;

import javax.annotation.Resource;

/**
 * Created by zhouhs on 2016/12/30.
 */
@RestController
@RequestMapping("/userinfo")
public class UserInfoController {

    @Resource //能够自动转换为Service，无需声明
    IUserInfoService mIUserInfoService;

    //@RequestMapping(value = "/addUser" , method = RequestMethod.POST)
    @RequestMapping("/savelisi")
    public DemoBean addUser(){
        DemoBean demo = new DemoBean();
        demo.setXm("lisi");
        demo.setXb("m");
        demo.setCsny("2010-10-01");
        mIUserInfoService.save(demo);
        return demo;
    }

    @RequestMapping("/getUserInfoById")
    public DemoBean getUserInfoById(){
        DemoBean demo = mIUserInfoService.findById(2);
        return demo;
    }
    
    //post //postman访问：http://192.168.35.35:9090/userinfo/postUserInfoById?id=1
    @RequestMapping(value = "/postUserInfoById" , method = RequestMethod.POST)
    public DemoBean postUserInfoById(@RequestParam(value = "id") int id){
        DemoBean demo = mIUserInfoService.findById(id);
        return demo;
    }
    
    //get
    //http://localhost:9090/userinfo/getUserInfoById?id=2
    @RequestMapping(value = "/getUserInfoById" , method = RequestMethod.GET)
    public DemoBean findById(@RequestParam(value = "id") int id){
        DemoBean demo = mIUserInfoService.findById(id);
        return demo;
    }
}
