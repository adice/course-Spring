package advices;

import java.lang.reflect.Method;

import org.springframework.aop.AfterReturningAdvice;

public class ScoreAdvice implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object arg0, Method arg1, Object[] arg2, Object arg3) throws Throwable {
		System.out.println(arg0);
		System.out.println(arg1.getName());
		System.out.println(arg2[0]);
		System.out.println(arg3);
		System.out.println("用户注册成功，赠送100积分。");
	}

}
