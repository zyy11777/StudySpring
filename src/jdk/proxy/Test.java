package jdk.proxy;

public class Test {
	
	@org.junit.Test
	public void demo() {
		UserService us = MyBeanFactory.createService();
		us.addUser();
		us.updateUser();
		us.deleteUser();
	}

}
