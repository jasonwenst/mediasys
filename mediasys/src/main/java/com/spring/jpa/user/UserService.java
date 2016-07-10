package com.spring.jpa.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

@Service
public class UserService {

	@Resource
	private IUserDao userDao;
	
	public User getUserByUsername(String username) {
		return userDao.findUserByUsername(username);
	}
	
	
	public void saveUser(User user) {
		userDao.save(user);
	}
	
}
