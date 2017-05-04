package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UserServiceImpl userServiceImpl=(UserServiceImpl)ctx.getBean("UserServiceProxy");
		userServiceImpl.regist("zhangsan", "123456");
		userServiceImpl.registUser("lisi", "123456");
	}

}
