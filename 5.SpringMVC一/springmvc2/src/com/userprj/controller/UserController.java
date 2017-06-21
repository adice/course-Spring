package com.userprj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.userprj.bean.User;
import com.userprj.biz.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
	@Autowired
	private UserService userService;

	@RequestMapping("/createUser")
	public ModelAndView createUser(User user) {
		this.userService.createUser(user);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("user/createSuccess");
		mav.addObject(user);
		return mav;
	}

	@RequestMapping("/*/mapping")
	public String mapping1() {
		System.out.println("mapping1");
		return "";
	}

	@RequestMapping("/{userID}")
	public String mapping2(@PathVariable
	String userID) {
		System.out.println("mapping2" + userID);
		return "";
	}

	@RequestMapping(method = RequestMethod.GET)
	public String mapping3() {
		System.out.println("mapping3");
		return "";
	}

	@RequestMapping(params = "userId")
	public String mapping4(@RequestParam
	String userId) {
		System.out.println("mapping4" + userId);
		return "";
	}

	@RequestMapping(value = "/baowentou", headers = "content-type=text/*")
	public String mapping5() {
		System.out.println("mapping5");
		return "";
	}

	// ================================================
	@RequestMapping(value = "/hi1")
	public String mapping6(@RequestParam("username")
	String userName, @RequestParam("userage")
	String userAge) {
		System.out.println("mapping6" + userName+userAge);
		return "";
	}
	@RequestMapping(value = "/hi2")
	public String mapping7(@CookieValue("JSESSIONID")
	String sessionId, @RequestHeader("Accept-Language")
	String language) {
		System.out.println("mapping7" + sessionId+language);
		return "";
	}
	@RequestMapping(value = "/hi3")
	public String mapping8(User user) {
		System.out.println("mapping8" + user.getUserName());
		return "";
	}
	@RequestMapping(value = "/hi4")
	public String mapping9(HttpServletRequest request) {
		System.out.println("mapping8" + request.getRemoteAddr());
		return "";
	}
}
