package com.json;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JSONController {
	@RequestMapping("JSONController")
	public String showJsonList(ModelMap mm){
		Map map=new HashMap();
		map.put("a", "aaa");
		map.put("b", "bbb");
		map.put("c", "ccc");
		mm.addAttribute("mm",mm);
		
		return "userListJson";
	}
}
