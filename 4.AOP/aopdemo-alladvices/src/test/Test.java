package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import service.UserService;
import service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)ctx.getBean("UserServiceProxy");
		boolean isRegist=userService.regist("zhangsan", "123456");
		System.out.println("注册是否成功："+isRegist);
	}

}
