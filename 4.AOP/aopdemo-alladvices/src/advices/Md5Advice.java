package advices;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

import util.Md5Encode;

public class Md5Advice implements MethodBeforeAdvice {
	@Override
	public void before(Method arg0, Object[] arg1, Object arg2) throws Throwable {
		System.out.println(arg0.getName());
		System.out.println(arg2.getClass().getName());
		System.out.println(arg1[0]);
		arg1[1]=Md5Encode.getMD5(arg1[1].toString().getBytes());
	}

}
