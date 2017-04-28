package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.service.UserService;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UserService userService=(UserService)ctx.getBean("UserServiceImpl");
		userService.regist("zhangsan", "123456");
	}

}
