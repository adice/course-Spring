package com.excel;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class ExcelController {
	@RequestMapping("ExcelController")
	public String showUserListInExcel(){
		return "userListExcel";
	}
}
