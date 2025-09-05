package com.kh.user.model.dto;

public class UserDTO {
	private String userId; //USER_ID
	private String userPwd; //USER_PWD
	private String userName; //USER_NAME
	private int userAge; //USER_AGE
	private String userGender; //USER_GENDER
	
	public UserDTO() {
		super();
	}
	
	public UserDTO(String userId, String userPwd, String userName, int userAge, String userGender) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.userAge = userAge;
		this.userGender = userGender;
	}

	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	
}
