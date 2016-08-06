package com.pro.services;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.pro.dao.UserDao;

import com.pro.domain.Users;
@Service("userService")
public class UserServiceImpl implements UserService {
	@Resource
	private UserDao userDao;
	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	public void addUser(Users user) {
		userDao.save(user);

	}

}
