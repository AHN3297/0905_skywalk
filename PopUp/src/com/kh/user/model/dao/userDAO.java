package com.kh.user.model.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

import com.kh.common.JDBCTemplate;
import com.kh.user.model.vo.User;

public class UserDAO {
	
	private Properties prop = new Properties();
	
	public UserDAO () {
		try {
			prop.loadFromXML(new FileInputStream("resources/USER-mapper.xml"));
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	public List<User> UserFindAll(Connection conn) {
		List<User> users = new ArrayList();
		PreparedStatement pstmt = null;
		ResultSet rset = null;
		
		String sql = prop.getProperty("UserFindAll");
		
		try {
			pstmt = conn.prepareStatement(sql);
			rset = pstmt.executeQuery();
			
			while(rset.next()) {
				User user = new User(rset.getString("USER_ID")
									,rset.getString("USER_PWD")
									,rset.getString("USER_NAME")
									,rset.getInt("USER_AGE")
									,rset.getString("USER_GENDER"));
				users.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			JDBCTemplate.close(rset);
			JDBCTemplate.close(pstmt);
		}
		
		return users;
	}
	
	public int UserInsert(Connection conn, User user) {

		PreparedStatement pstmt = null;
		int result = 0;
		String sql = prop.getProperty("UserInsert");
		
		try {
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, user.getUserId());
			pstmt.setString(2, user.getUserPwd());
			pstmt.setString(3, user.getUserName());
			pstmt.setInt(4, user.getUserAge());
			pstmt.setString(4, user.getUserGender());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		
		return result;
	}

}
