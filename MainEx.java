package sungbus;

import java.util.Scanner;

public class MainEx {

	public static void main(String[] args) {
		
		ClientManager cm = new ClientManager();
		
		Scanner sc = new Scanner(System.in);
		
		close:
			while(true){
				System.out.println("==============================");
				System.out.println("==============�޴�=============");
				System.out.println("==============================");
				System.out.println("[1].ȸ������");
				System.out.println("[2].�α���");
				System.out.println("[3].����");
				System.out.println("����>>>>");
				int menu = sc.nextInt();
				switch(menu){
				case 1:
					cm.createUser();
					break;
				case 2:
					cm.login();
					break;
				case 3 :
					System.out.println("�����մϴ�.");
					break close;
				default :
					System.out.println("�ٽ��Է��ϼ���.");		
				}
			}
	}

}
