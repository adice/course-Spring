package com.users.advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;
import org.springframework.aop.framework.ProxyFactoryBean;

import com.users.util.Md5Encode;

public class Md5Advice implements MethodBeforeAdvice {
	public void before(Method arg0, Object[] arg1, Object arg2)
			throws Throwable {
		System.out.println(arg0.getName());
		System.out.println(arg1[1]);
		System.out.println(arg2.getClass().getName());
		
		String newPass=Md5Encode.getMD5(arg1[1].toString().getBytes());
		arg1[1]=newPass;
	}

}
