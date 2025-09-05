package com.kh.user.view;

import java.util.List;
import java.util.Scanner;

import com.kh.pop.view.PopView;
import com.kh.user.controller.UserController;
import com.kh.user.model.vo.User;

public class UserView {

	private Scanner sc = new Scanner(System.in);
	private UserController uc = new UserController();

	public void mainMenu() {
		while (true) {
			System.out.println("유저 관리 페이지입니다.");
			System.out.println("1. 전체 유저 보기");
			System.out.println("2. 유저 가입");
			System.out.println("3. 유저 정보 수정");
			System.out.println("4. 유저 삭제");
			System.out.println("5. 팝업 관리");
			System.out.println("9. 프로그램종료");
			int menuNo = sc.nextInt();
			sc.nextLine();

			switch (menuNo) {
			case 1:UserfindAll();
				break;
			case 2:UserInsert();
				break;
			case 3:
				break;
			case 4:
				break;
			case 5: PopNext();
				System.out.println("팝업 관리로 넘어갑니다.");
				new PopView().popMenu(); break;
				
			case 9:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}
	}
	
	public void UserfindAll() { // 전체 회원 보기 메소드
		System.out.println("\n 전체 회원 보기입니다.");
		List<User> users = uc.UserFindAll();
		
		System.out.println("조회된 회원분들 입니다.");
		if(users.isEmpty()) {
			System.out.println("조회된 결과가 없습니다.");
		} else {
			for(User u : users) {
				System.out.print(" 아이디 : " + u.getUserId());
				System.out.print(" 비밀번호 : " + u.getUserPwd());
				System.out.print(" 이름 : " + u.getUserName());
				System.out.print(" 나이 : " + u.getUserAge());
				System.out.println(" 성별 : " + u.getUserGender());
			}
		}
		
	}
	
	public void UserInsert() { // 유저 추가 메소드
		System.out.println("유저 추가 기능입니다.");
		System.out.println("유저의 아이디를 입력해주세요 > ");
		String userId = sc.nextLine();
		System.out.println("비밀번호를 입력해주세요 > ");
		String userPwd = sc.nextLine();
		System.out.println("이름을 입력해주세요 > ");
		String userName = sc.nextLine();
		System.out.println("나이를 입력해주세요(숫자로 입력해주세요) > ");
		int userAge = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력해주세요 > ");
		String userGender = sc.nextLine();
		
		int result = uc.UserInsert(userId, userPwd, userName, userAge, userGender);
		
		if(result > 0) {
			System.out.println("회원가입에 성공하셨습니다.");
		} else {
			System.out.println("회원가입에 실패하셨습니다.");
		}
		
	}
	
	public void PopNext() { // 팝업 관리로 넘어가는 메소드
		PopView pv = new PopView();
		pv.popMenu();
	}
}
