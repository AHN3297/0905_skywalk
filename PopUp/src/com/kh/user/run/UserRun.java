package com.kh.user.run;

import com.kh.common.JDBCTemplate;
import com.kh.user.view.UserView;

public class UserRun {

	public static void main(String[] args) {
		JDBCTemplate.registDriver();
		UserView uv =new UserView();
		uv.mainMenu();
		
	}

}
