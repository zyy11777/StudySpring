package di;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Tests {
	
//	@Test
//	public void test() {
//		//1、获得spring容器
//		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
//		//2、从spring容器中取得对象
//		UserService user = (UserService) ac.getBean("user");
//		//3、调用add方法
//		user.addUser();
//	}
	
	@Test
	public void test1() {
		//1、获得spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从spring容器中取得对象
		UserService user = (UserService) ac.getBean("userService");
		//3、调用add方法
		user.addUser();
	}
}
