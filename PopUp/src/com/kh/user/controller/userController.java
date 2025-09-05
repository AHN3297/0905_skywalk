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
		// 받은 매개변수들 User객체로 정보를 받아주기
		User user = new User(userId, userPwd, userName, userAge, userGender);
		
		int result = new UserService().UserInsert(user);
		
		return result;
	}
}
