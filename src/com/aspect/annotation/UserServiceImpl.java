package com.aspect.annotation;

import org.springframework.stereotype.Service;

@Service("userserviceid")
public class UserServiceImpl implements UserService {

	public void addUser() {
		System.out.println("添加学生");
	}

	public void updateUser() {
		System.out.println("更新学生");
		
	}

	public void deleteUser() {
		System.out.println("删除学生");
		
	}

}
