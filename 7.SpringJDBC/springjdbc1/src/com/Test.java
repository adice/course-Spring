package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.bean.Cup;
import com.biz.CupBizImpl;

public class Test {

	/**
	 * @desc
	 * @author wangwei
	 * @createDate 2012-12-6
	 * @param args
	 */
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("beans.xml");
		CupBizImpl cupbiz=(CupBizImpl)ctx.getBean("cupBizImpl");
		Cup cup=new Cup();
		cup.setCupId(4);
		cup.setCupPrice(20);
		cup.setCupBrand("aa");
		cupbiz.addCup(cup);
	}

}
