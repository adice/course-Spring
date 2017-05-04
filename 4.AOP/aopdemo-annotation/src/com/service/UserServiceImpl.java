package com.service;

import org.springframework.stereotype.Component;

@Component("UserServiceImpl")
public class UserServiceImpl implements UserService {
	
	public boolean regist(String name,String password){
		System.out.println("用户"+name+"注册成功，密码是"+password);
//		int a=10/0;
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		return true;
	}

}
