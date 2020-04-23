package day01.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestDemo {
	@Test
	public void fun1() {
		// 1创建容器对象
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		// 2向容器‘要’user对象
		User u = (User) ac.getBean("user");
		// 3打印user对象
		System.out.println(u.getName());
	}
}
