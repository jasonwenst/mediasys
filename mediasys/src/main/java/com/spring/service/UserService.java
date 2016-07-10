package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.dao.IUserDao;
import com.spring.entity.User;

@Service
public class UserService {

	@Resource
	private IUserDao userDao;
	
	public User getUserByUsername(String username) {
		return userDao.findUserByUserName(username);
	}
	
	
	public void saveUser(User user) {
		userDao.save(user);
	}
	
}
