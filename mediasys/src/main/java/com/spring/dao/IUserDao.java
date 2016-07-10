package com.spring.dao;

import org.springframework.data.repository.CrudRepository;

import com.spring.entity.User;

public interface IUserDao extends CrudRepository<User, Integer> {

//	User findUserByUsername(String username);
	
	User findUserByUserName(String username);
}
