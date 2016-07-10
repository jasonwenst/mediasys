package com.spring.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String userName;
	
	private String password;

	private User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}
	
	

	public User() {
		super();
	}



	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password="
				+ password + "]";
	}
	
	

}
