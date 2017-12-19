package hello.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 通用参数配置
 * @author Administrator
 *
 */
@Controller
@RequestMapping("param")
public class SystemParamController {

    //http://localhost:8081/?param=list
	@RequestMapping(value = "list",method=RequestMethod.GET)
	public String index(){
			return "index.html";
	}

}
