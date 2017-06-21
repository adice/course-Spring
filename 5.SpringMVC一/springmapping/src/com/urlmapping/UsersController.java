package com.urlmapping;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UsersController {

	@RequestMapping("/regist")
	public void regist(HttpServletResponse response){
		System.out.println("/user/regist.do");
		try {
			response.getWriter().write("user/regist.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/*/regist")
	public void aaaregist(HttpServletResponse response){
		System.out.println("/user/aaa/regist.do");
		try {
			response.getWriter().write("user/aaa/regist.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/**/regist")
	public void aaabbbregist(HttpServletResponse response){
		System.out.println("/user/aaa/bbb/regist.do");
		try {
			response.getWriter().write("user/aaa/bbb/regist.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/regist?")
	public void registA(HttpServletResponse response){
		System.out.println("/user/registA.do");
		try {
			response.getWriter().write("user/registA.do");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@RequestMapping("/regist{userId}")
	public void registUserId(@PathVariable("userId")String userId,HttpServletResponse response){
		System.out.println("/user/regist{userId}.do");
		try {
			response.getWriter().write("user/regist{userId}.do?userId="+userId);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
