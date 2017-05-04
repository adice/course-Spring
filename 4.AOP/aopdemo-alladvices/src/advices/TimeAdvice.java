package advices;

import java.util.Date;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class TimeAdvice implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation arg0) throws Throwable {
		System.out.println("方法开始执行时间："+new Date().toLocaleString());
		Object result = arg0.proceed();
		System.out.println("方法结束执行时间："+new Date().toLocaleString());
		return result;
	}

}
