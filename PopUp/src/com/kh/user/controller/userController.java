package com.kh.user.controller;

import java.util.List;

import com.kh.user.model.service.UserService;
import com.kh.user.model.vo.User;

public class UserController {
	
	public List<User> UserFindAll() {
		List<User> users = new UserService().UserFindAll();
		
		return users;
	}
	
	public int UserInsert(String userId,String userPwd,String userName,int userAge,String userGender) {
		
		 = new UserService().UserInsert();
		
		return result;
	}
}
