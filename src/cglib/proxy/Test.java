package cglib.proxy;

public class Test {
	
	@org.junit.Test
	public void demo() {
		UserServiceImpl us = MyBeanFactory.createService();
		us.addUser();
		us.updateUser();
		us.deleteUser();
	}

}
