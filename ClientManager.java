package sungbus;


import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class ClientManager implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 6144463735552731723L;
	private ArrayList<Client> clist;
	private Busmanager bm;
	public ClientManager() {
		clist = new ArrayList<>();
		bm =new Busmanager();
		
	}



	public ArrayList<Client> getClist() {
		return clist;
	}

	public void setClist(ArrayList<Client> clist) {
		this.clist = clist;
	}

	public void createUser() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("==========회원가입==========");
		System.out.println("==========================");
		System.out.println("아이디, 비밀번호, 이름, 나이, 성별을 입력하세요");

		String mid;
		Client c;

		do{
			System.out.println("아이디를 입력하세요");
			mid =sc.nextLine();
			c = searchClient(mid);
			if(c!=null){
				System.out.println("아이디가 사용중입니다.다시입력해주세요.");
			}
		}while(c!=null);

		c=new Client();
		c.setMid(mid);
		c.join();
		clist.add(c);
	}

	private Client searchClient(String mid) {
		Client c = null;
		for (int i = 0; i < clist.size(); i++) {
			if(mid.equals(clist.get(i).getMid())){
				c=clist.get(i);
				break;
			}
		}
		return c;
	}

	public void login() {
		Scanner sc = new Scanner(System.in);
		System.out.println("==========================");
		System.out.println("==========로그인============");
		System.out.println("==========================");
		System.out.println("");
		System.out.print("아이디 : ");
		String mid =sc.nextLine();
		System.out.print("비밀번호 : ");
		String pwd =sc.nextLine();
		Client c = searchClient(mid); 
		if(c==null){
			System.out.println("회원이 아닙니다.");
			return;
		}else if(!c.getPwd().equals(pwd)){
			System.out.println("비밀번호가 틀렸습니다.");
			return;
		}else{
			System.out.println(c.getMid()+"님 환영합니다.");
		}
		menuSelect(c);

	}

	private void menuSelect(Client c) {
		boolean out =false;
		Scanner sc = new Scanner(System.in);
		esc:
			while(true){
				System.out.println("==========================");
				System.out.println("쌍용버스터미널에 오신걸 환영합니다.");
				System.out.println("==========================");
				System.out.println("[1].마이페이지");
				System.out.println("[2].승차권 예약");
				System.out.println("[3].메뉴로");
				System.out.println("==========================");
				int menu = sc.nextInt();
				switch(menu){

				case 1 :
					out = mypage(c);
					if(out==true){
						break esc;
					}else{
						break;
					}
				case 2 :
					bm.busSelect(c);
					break;
				case 3 :
					break esc;
				default :
					System.out.println("1~3 사이의 메뉴선택숫자를 입력해주세요");
				}
			}
	}


	private boolean mypage(Client c) {
		Scanner sc = new Scanner(System.in);
		boolean out=false;
		esc:
			while(true){
				System.out.println("==========================");
				System.out.println("=========메뉴 선택==========");
				System.out.println("==========================");
				System.out.println("[1].회원정보수정");
				System.out.println("[2].회원탈퇴");
				System.out.println("[3].메뉴로 가기");
				System.out.println("==========================");
				int menu =sc.nextInt();
				switch (menu) {
				case 1:
					c.updateClient();
					break;
				case 2:
					out=removemember(c);
					if(out==true){
						//out=true;
						break esc;
					}else{
						break ;
					}
				case 3:
					break esc;
				default:
					System.out.println("1~3사이의 수를 입력하세요.");
					break;
				} // end of switch
			}
		return out;
	}
	private boolean removemember(Client c) {
		boolean out =false;
		for (int i = 0; i < clist.size(); i++) {
			if(c.getMid().equals(clist.get(i).getMid())) {
				clist.remove(i);
				bm.deleteBus(c);
				out=true;
			}
		}
		return out;
	}

}
