package ioc;

import org.junit.Test;

public class UserServiceImpl implements UserService {

	private UserDao userdao;

	public void setUserdao(UserDao userdao) {
		this.userdao = userdao;
	}

	@Test
	public void addUser() {
		System.out.println("ioc add user");
	}
}
