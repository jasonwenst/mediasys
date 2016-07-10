package com.spring.jpa.user;

import org.springframework.data.repository.CrudRepository;

public interface IUserDao extends CrudRepository<User, Integer> {

	User findUserByUsername(String username);
}
