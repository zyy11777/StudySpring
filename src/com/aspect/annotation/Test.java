package com.aspect.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	@org.junit.Test
	public void demo() {
		String xmlpath = "com/aspect/annotation/applicationContext.xml";
		ApplicationContext app = new ClassPathXmlApplicationContext(xmlpath);
		
		
		// 获得代理类
		UserService us = (UserService) app.getBean("userserviceid");
		us.addUser();
		us.updateUser();
		us.deleteUser();
	}

}
