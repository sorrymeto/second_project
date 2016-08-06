package com.pro.dao;

import org.springframework.stereotype.Repository;

import com.pro.domain.Users;
@Repository("userDao")
public interface UserDao {

	public void save(Users user);
}
