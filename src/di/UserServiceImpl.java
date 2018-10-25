package di;


public class UserServiceImpl implements UserService {

	private UserDao userDao;

	public void setUserdao(UserDao userDao) {
		this.userDao = userDao;
	}
	
	public void addUser() {
		this.userDao.addUser();
//		System.out.println("ioc add user");
	}
}
