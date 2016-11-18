package com.users.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.users.biz.UsersBiz;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		UsersBiz ub=(UsersBiz)ctx.getBean("UsersBizProxy");
		boolean b=ub.regist("zs", "123");
		System.out.println("result:"+b);
	}

}
