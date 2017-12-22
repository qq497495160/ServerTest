package com.hello.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hello.bean.DemoBean;
import com.hello.service.DemoBeanService;

//@SpringBootApplication //方法二:http://blog.csdn.net/goodelephant/article/details/52160974
@RestController // 页面用Controller //Gson用RestController
@RequestMapping("/demobean")
public class DemoBeanController {

    @Autowired
    private DemoBeanService mDemoBeanService;

    @RequestMapping("/list")
    public List<DemoBean> getStus(){
    	System.out.println("getStus 中国》》》》》》》》》 进来了");
        return mDemoBeanService.getList();
    }
    
	@RequestMapping("/getDemo")
	public DemoBean getDemo() {
		DemoBean demo = new DemoBean();
		demo.setId(1);
		demo.setName("lisi");
		demo.setXb("m");
		demo.setCsny("2010-10-01");
		return demo;
	}

    @RequestMapping("/savelisi")
    public String save(){
		DemoBean demo = new DemoBean();
		demo.setId(1);
		demo.setName("lisi");
		demo.setXb("m");
		demo.setCsny("2010-10-01");
		mDemoBeanService.save(demo);
        return "success";
    }
    
	// 方法二:http://blog.csdn.net/goodelephant/article/details/52160974
	// public static void main( String[] args ) {
	// System.out.println( "Hello World!" );
	// SpringApplication.run(UserController.class, args);
	// }
}
