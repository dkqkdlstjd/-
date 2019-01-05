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
		System.out.println("비밀번호를 입력하세요.");
		pwd = sc.nextLine();
		System.out.println("이름을 입력하세요.");
		name = sc.nextLine();
		System.out.println("나이를 입력하세요.");
		age = sc.nextInt();
		System.out.println("성별을 입력하세요.");
		sc.nextLine();
		gender = sc.nextLine();
		
	}
	public void ClientLook() {
		System.out.println("");
		System.out.println("------------");
		System.out.println("아이디 : "+mid);
		System.out.println("비밀번호 : "+pwd);
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별입력 : "+gender);
		
	}
	public void updateClient() {
		Scanner sc = new Scanner(System.in);
		System.out.println("비밀번호를 입력하세요.");
		String pwd = sc.nextLine();
		setPwd(pwd);

		System.out.println("나이를 입력하세요.");
		int age = sc.nextInt();
		setAge(age);
	}
	
	
}
