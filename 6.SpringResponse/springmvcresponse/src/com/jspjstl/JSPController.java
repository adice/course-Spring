package com.jspjstl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class JSPController {
	@RequestMapping("JSPController")
	public String show(ModelMap modelMap){
		List list=new ArrayList();
		for(int i=0;i<10;i++){
			list.add("user"+i);
		}
		modelMap.addAttribute("list",list);
		return "jspjstl";
	}
}
