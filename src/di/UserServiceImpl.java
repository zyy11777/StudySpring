package di;


public class UserServiceImpl implements UserService {

	private UserDao userDao;

	
	public UserDao getUserDao() {
		return userDao;
	}


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


	public void addUser() {
		this.userDao.addUser();
	}
}
