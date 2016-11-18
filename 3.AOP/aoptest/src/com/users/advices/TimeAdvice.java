package com.users.advices;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TimeAdvice implements MethodInterceptor {

	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("qian:"+System.currentTimeMillis());
//		Object obj=arg0.proceed();
		System.out.println("hou:"+System.currentTimeMillis());
		return false;
	}

}
