package sungbus;

import java.util.Scanner;

public class Client {

	private String mid;
	private String pwd;
	private String name;
	private int age;
	private String gender;
	
	
	@Override
	public String toString() {
		return "Client [mid=" + mid + ", pwd=" + pwd + ", name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	

	public Client() {
		this(null,null,null,0,null);
	
	}
	
	public Client(String mid,String pwd,String name,int age,String gender) {
		this.mid =mid;
		this.pwd =pwd;
		this.name =name;
		this.age =age;
		this.gender =gender;
	}

	public String getMid() {
		return mid;
	}
	public void setMid(String mid) {
		this.mid = mid;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void join() {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		pwd = sc.nextLine();
		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.nextLine();
		System.out.println("���̸� �Է��ϼ���.");
		age = sc.nextInt();
		System.out.println("������ �Է��ϼ���.");
		sc.nextLine();
		gender = sc.nextLine();
		
	}
	public void ClientLook() {
		System.out.println("");
		System.out.println("------------");
		System.out.println("���̵� : "+mid);
		System.out.println("��й�ȣ : "+pwd);
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+age);
		System.out.println("�����Է� : "+gender);
		
	}
	public void updateClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("��й�ȣ�� �Է��ϼ���.");
		String pwd = sc.nextLine();
		setPwd(pwd);

		System.out.println("���̸� �Է��ϼ���.");
		int age = sc.nextInt();
		setAge(age);
	}
	
	
}
