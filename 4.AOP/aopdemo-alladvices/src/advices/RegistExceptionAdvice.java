package advices;

import org.springframework.aop.ThrowsAdvice;

public class RegistExceptionAdvice implements ThrowsAdvice {
	
	public void afterThrowing(Exception e) {
		System.out.println("异常通知发生异常"+e.getMessage());
	}
}
