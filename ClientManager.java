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
		System.out.println("==========ȸ������==========");
		System.out.println("==========================");
		System.out.println("���̵�, ��й�ȣ, �̸�, ����, ������ �Է��ϼ���");

		String mid;
		Client c;

		do{
			System.out.println("���̵� �Է��ϼ���");
			mid =sc.nextLine();
			c = searchClient(mid);
			if(c!=null){
				System.out.println("���̵� ������Դϴ�.�ٽ��Է����ּ���.");
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
		System.out.println("==========�α���============");
		System.out.println("==========================");
		System.out.println("");
		System.out.print("���̵� : ");
		String mid =sc.nextLine();
		System.out.print("��й�ȣ : ");
		String pwd =sc.nextLine();
		Client c = searchClient(mid); 
		if(c==null){
			System.out.println("ȸ���� �ƴմϴ�.");
			return;
		}else if(!c.getPwd().equals(pwd)){
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			return;
		}else{
			System.out.println(c.getMid()+"�� ȯ���մϴ�.");
		}
		menuSelect(c);

	}

	private void menuSelect(Client c) {
		boolean out =false;
		Scanner sc = new Scanner(System.in);
		esc:
			while(true){
				System.out.println("==========================");
				System.out.println("�ֿ�����͹̳ο� ���Ű� ȯ���մϴ�.");
				System.out.println("==========================");
				System.out.println("[1].����������");
				System.out.println("[2].������ ����");
				System.out.println("[3].�޴���");
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
					System.out.println("1~3 ������ �޴����ü��ڸ� �Է����ּ���");
				}
			}
	}


	private boolean mypage(Client c) {
		Scanner sc = new Scanner(System.in);
		boolean out=false;
		esc:
			while(true){
				System.out.println("==========================");
				System.out.println("=========�޴� ����==========");
				System.out.println("==========================");
				System.out.println("[1].ȸ����������");
				System.out.println("[2].ȸ��Ż��");
				System.out.println("[3].�޴��� ����");
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
					System.out.println("1~3������ ���� �Է��ϼ���.");
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
