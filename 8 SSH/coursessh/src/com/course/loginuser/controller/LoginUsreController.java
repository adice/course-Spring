package com.course.loginuser.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.course.entity.LoginUser;
import com.course.entity.Menu;
import com.course.entity.Power;
import com.course.loginuser.service.LoginUserServiceImpl;
import com.google.gson.Gson;

@Controller
@RequestMapping("loginuser")
public class LoginUsreController {
	
	@Resource
	private LoginUserServiceImpl loginUserServiceImpl;
	
	@RequestMapping("login")
	public String login(@RequestParam("loginName") String name,
			@RequestParam("password") String password, HttpSession session){
		LoginUser lu=this.loginUserServiceImpl.login(name, password);
		if(lu!=null){
			session.setAttribute("realName", lu.getRole().getName());
			Set<Power> set=lu.getRole().getPowers();
			Iterator i=set.iterator();
			HashMap menus=new HashMap();
			List list=new ArrayList();
			while(i.hasNext()){
				Menu menu=(Menu)((Power)i.next()).getMenu();
				Menu pmenu=menu.getParentMenu();
				if(!menus.containsKey(pmenu))
					menus.put(pmenu, list);
				((List)menus.get(pmenu)).add(menu);
			}
			session.setAttribute("menus", menus);
			return "index-x";
		}else{
			return "login";
		}
	}
	
	@RequestMapping("checkname")
	@ResponseBody
	public String CheckNameExist(HttpServletRequest request){
		String name=request.getParameter("loginName");
		List<LoginUser> list=new ArrayList<LoginUser>();
		LoginUser l1=new LoginUser();
		l1.setLoginName("aa");
		l1.setPassword("11");
		l1.setEmail("aa");
		LoginUser l2=new LoginUser();
		l2.setLoginName("bb");
		l2.setPassword("22");
		l2.setEmail("bb");
		list.add(l1);
		list.add(l2);
		Gson gson=new Gson();
		return gson.toJson(list);
	}

}
