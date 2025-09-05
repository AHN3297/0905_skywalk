package com.kh.common;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JDBCTemplate {
	
	public static void registDriver() {
<<<<<<< HEAD
=======
		
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
<<<<<<< HEAD
	
	
	public static Connection getConnection() {
		Properties prop = new Properties();
		try {
			prop.load(new FileInputStream("resources/driver.properties"));
			
			
			System.out.println(prop.getProperty("URL"));
			
=======

	public static Connection getConnection() {
		
		try {
			Properties prop = new Properties();
			
			prop.load(new FileInputStream("resources/driver.properties"));
			
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
			Connection conn = DriverManager.getConnection(prop.getProperty("URL")
														 ,prop.getProperty("USERNAME")
														 ,prop.getProperty("PASSWORD"));
			conn.setAutoCommit(false);
			return conn;
		} catch (SQLException | IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	
	public static void commit(Connection conn) {
<<<<<<< HEAD
=======
		
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
		try {
			if(conn != null) {
				conn.commit();
			}
<<<<<<< HEAD
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void rollback(Connection conn) {
		try {
			if(conn !=null) {
				conn.rollback();
			}
			
		}catch(SQLException e) {
=======
			
		} catch (SQLException e) {
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
			e.printStackTrace();
		}
		
	}
<<<<<<< HEAD

	public static void close(Connection conn) {
=======
	
	public static void rollback(Connection conn) {
		
		try {
			if(conn != null) {
				conn.rollback();
			}
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Connection conn) {
		
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
		try {
			if(conn != null) {
				conn.close();
			}
			
<<<<<<< HEAD
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	// 
	public static void close(Statement stmt) {
		try {
			if(stmt != null) {
				stmt.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rset) {
		try {
=======
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(Statement stmt) {
		
		try {
			
			if(stmt != null) {
				stmt.close();
			}
			
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void close(ResultSet rset) {
		
		try {
			
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
			if(rset != null) {
				rset.close();
			}
			
<<<<<<< HEAD
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
=======
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
>>>>>>> 8e2c614088a0cf15c830a8e34d0e9524ba6a0ece
}
