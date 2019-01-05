package sungbus;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		
		ClientManager cm = new ClientManager();
		
		Scanner sc = new Scanner(System.in);
		
		close:
			while(true){
				System.out.println("==============================");
				System.out.println("==============메뉴=============");
				System.out.println("==============================");
				System.out.println("[1].회원가입");
				System.out.println("[2].로그인");
				System.out.println("[3].종료");
				System.out.println("선택>>>>");
				int menu = sc.nextInt();
				switch(menu){
				case 1:
					cm.createUser();
					break;
				case 2:
					cm.login();
					break;
				case 3 :
					System.out.println("종료합니다.");
					break close;
				default :
					System.out.println("다시입력하세요.");		
				}
			}
	}

}
