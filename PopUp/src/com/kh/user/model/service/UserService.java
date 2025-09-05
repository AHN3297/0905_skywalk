package com.kh.user.model.service;

import static com.kh.common.JDBCTemplate.getConnection;

import java.sql.Connection;
import java.util.List;

import com.kh.common.JDBCTemplate;
import com.kh.user.model.dao.UserDAO;
import com.kh.user.model.vo.User;

public class UserService {
	private Connection conn = null;
	
	public UserService() {
		this.conn = getConnection();
		
	}
	
	public List<User> UserFindAll() {
		List <User> users =new UserDAO().UserFindAll(conn);
		
		JDBCTemplate.close(conn);
		
		return users;
	}
	
<<<<<<< HEAD
	public int UserInsert() {
		int result = new UserDAO().UserInsert(conn);
=======
	public int UserInsert(User user) {
		
		int result = new UserDao().UserInsert(conn, user);
		
		JDBCTemplate.close(conn);
>>>>>>> b89b351807aa8af79cda980416a1a7eafdb3ac85
		
		return result;
	}

}
