package com.advices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import util.Md5Encode;

@Component
@Aspect
public class MyAdvice {
	
	@Before("execution(* com.service.*.regist(..))")
	public void beforeMethod(JoinPoint joinPoint) {
		System.out.println("被代理方法名字："+joinPoint.getSignature().getName());
		System.out.println("被代理方法参数："+joinPoint.getArgs());
		System.out.println("被代理对象："+joinPoint.getTarget());
		System.out.println("现在调用的是前置方法");
	}
	
	@AfterReturning(pointcut="execution(* com.service.*.*(..))",returning="result")
	public void afterReturningMethod(JoinPoint joinPoint, Object result){
		System.out.println("被代理方法名字："+joinPoint.getSignature().getName());
		System.out.println("被代理方法参数："+joinPoint.getArgs());
		System.out.println("被代理对象："+joinPoint.getTarget());
		System.out.println("被代理对象的返回值"+result);
		System.out.println("现在调用的是后置方法");
	}
	
	@Around("execution(* com.service.*.*(..))")
	public Object aroundMethod(ProceedingJoinPoint joinPoint) {
		System.out.println("现在调用的是环绕方法------");		
		Object[] args=joinPoint.getArgs();
		args[1]=Md5Encode.getMD5(args[1].toString().getBytes());
		Object result=null;
		try {
			result=joinPoint.proceed(args);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		System.out.println("现在调用的是环绕方法------");
		return result;
	}
	
	@AfterThrowing(value="execution(* com.service.*.*(..))", throwing="ex")
	public void throwExMethod(Exception ex) {
		System.out.println("现在调用的是异常方法------");
		System.out.println(ex.getMessage());
		
	}
	
	@After("execution(* com.service.*.*(..))")
	public void afterMethod(JoinPoint joinPoint){
		System.out.println("被代理方法名字："+joinPoint.getSignature().getName());
		System.out.println("被代理方法参数："+joinPoint.getArgs());
		System.out.println("被代理对象："+joinPoint.getTarget());
		System.out.println("现在调用的是最终方法");
	}
}
