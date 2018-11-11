package di;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
	
	@Test
	public void test2() {
		//1、获得spring容器
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2、从spring容器中取得对象
		StudentService user = (StudentService) ac.getBean("StudentService");
		//3、调用add方法
		user.addStudent();
	}

	@Test
	public void test3() {
		List<String> arr = new ArrayList<String>();
		arr.add("as");
		arr.get(0);
		System.out.println(arr);
		Map<String, String> map = new HashMap<String, String>();
		map.put("afsd", "sfda");
	}
}
