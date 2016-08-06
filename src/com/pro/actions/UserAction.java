package com.pro.actions;

import javax.annotation.Resource;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import com.pro.domain.Users;
import com.pro.services.UserService;
import com.pro.services.UserServiceImpl;

@Controller
@Scope("prototype")
public class UserAction {

	private Users user;
	
	@Resource
	private UserService userService;
	
	public void setUserService(UserService userService) {
		this.userService = userService;
	}


	public Users getUser() {
		return user;
	}


	public void setUser(Users user) {
		this.user = user;
	}


	public String save(){
		
		userService.addUser(user);
		return "success";
	}
}
