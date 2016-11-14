package com.pdf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PDFController {
	@RequestMapping("PDFController.do")
	public String showUserListPdf(){
		return "userListPdf";
	}
}
