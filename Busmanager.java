package sungbus;

import java.util.ArrayList;
import java.util.Scanner;

import ch26_bank_member.Account;

public class Busmanager {
	private ArrayList<Bus> buslist;
	private ArrayList<Reserve> rlist;

	public Busmanager() {
		buslist = new ArrayList<>();
		rlist = new ArrayList<>();
		// �뱸��
		//�뱸 6:20�� ��
		Bus db0 = new Bus(0,"06:20", "����", "�뱸", 0);
		buslist.add(db0);
		Bus db1 = new Bus(1,"06:20", "����", "�뱸", 1);
		buslist.add(db1);
		Bus db2 = new Bus(2,"06:20", "����", "�뱸", 2);
		buslist.add(db2);
		Bus db3 = new Bus(3,"06:20", "����", "�뱸", 3);
		buslist.add(db3);
		Bus db4 = new Bus(4,"06:20", "����", "�뱸", 4);
		buslist.add(db4);
		Bus db5 = new Bus(5,"06:20", "����", "�뱸", 5);
		buslist.add(db5);
		Bus db6 = new Bus(6,"06:20", "����", "�뱸", 6);
		buslist.add(db6);
		//�뱸 7:30�� ��
		Bus db7 = new Bus(7,"07:30", "����", "�뱸", 0);
		buslist.add(db7);
		Bus db8 = new Bus(8,"07:30", "����", "�뱸", 1);
		buslist.add(db8);
		Bus db9 = new Bus(9,"07:30", "����", "�뱸", 2);
		buslist.add(db9);
		Bus db10 = new Bus(10,"07:30", "����", "�뱸", 3);
		buslist.add(db10);
		Bus db11 = new Bus(11,"07:30", "����", "�뱸", 4);
		buslist.add(db11);
		Bus db12 = new Bus(12,"07:30", "����", "�뱸", 5);
		buslist.add(db12);
		Bus db13 = new Bus(13,"07:30", "����", "�뱸", 6);
		buslist.add(db13);
		//�뱸 8:45�� ��
		Bus db14 = new Bus(14,"08:45", "����", "�뱸", 0);
		buslist.add(db14);
		Bus db15 = new Bus(15,"08:45", "����", "�뱸", 1);
		buslist.add(db15);
		Bus db16 = new Bus(16,"08:45", "����", "�뱸", 2);
		buslist.add(db16);
		Bus db17 = new Bus(17,"08:45", "����", "�뱸", 3);
		buslist.add(db17);
		Bus db18 = new Bus(18,"08:45", "����", "�뱸", 4);
		buslist.add(db18);
		Bus db19 = new Bus(19,"08:45", "����", "�뱸", 5);
		buslist.add(db19);
		Bus db20 = new Bus(20,"08:45", "����", "�뱸", 6);
		buslist.add(db20);
		//����
		//���� 6:20�� ��
		Bus gb21 = new Bus(21,"06:20", "����", "����", 0);
		buslist.add(gb21);
		Bus gb22 = new Bus(22,"06:20", "����", "����", 1);
		buslist.add(gb22);
		Bus gb23= new Bus(23,"06:20", "����", "����", 2);
		buslist.add(gb23);
		Bus gb24 = new Bus(24,"06:20", "����", "����", 3);
		buslist.add(gb24);
		Bus gb25 = new Bus(25,"06:20", "����", "����", 4);
		buslist.add(gb25);
		Bus gb26 = new Bus(26,"06:20", "����", "����", 5);
		buslist.add(gb26);
		Bus gb27 = new Bus(27,"06:20", "����", "����", 6);
		buslist.add(gb27);
		//���� 7:30�� ��
		Bus gb28 = new Bus(28,"07:30", "����", "����", 0);
		buslist.add(gb28);
		Bus gb29 = new Bus(29,"07:30", "����", "����", 1);
		buslist.add(gb29);
		Bus gb30 = new Bus(30,"07:30", "����", "����", 2);
		buslist.add(gb30);
		Bus gb31 = new Bus(31,"07:30", "����", "����", 3);
		buslist.add(gb31);
		Bus gb32 = new Bus(32,"07:30", "����", "����", 4);
		buslist.add(gb32);
		Bus gb33 = new Bus(33,"07:30", "����", "����", 5);
		buslist.add(gb33);
		Bus gb34 = new Bus(34,"07:30", "����", "����", 6);
		buslist.add(gb34);
		//���� 8:45�� ��
		Bus gb35 = new Bus(35,"08:45", "����", "����", 0);
		buslist.add(gb35);
		Bus gb36 = new Bus(36,"08:45", "����", "����", 1);
		buslist.add(gb36);
		Bus gb37 = new Bus(37,"08:45", "����", "����", 2);
		buslist.add(gb37);
		Bus gb38 = new Bus(38,"08:45", "����", "����", 3);
		buslist.add(gb38);
		Bus gb39 = new Bus(39,"08:45", "����", "����", 4);
		buslist.add(gb39);
		Bus gb40 = new Bus(40,"08:45", "����", "����", 5);
		buslist.add(gb40);
		Bus gb41 = new Bus(41,"08:45", "����", "����", 6);
		buslist.add(gb41);
		//�λ� 6:20�� ��
		Bus bb42 = new Bus(42,"06:20", "����", "�λ�", 0);
		buslist.add(bb42);
		Bus bb43 = new Bus(43,"06:20", "����", "�λ�", 1);
		buslist.add(bb43);
		Bus bb44= new Bus(44,"06:20", "����", "�λ�", 2);
		buslist.add(bb44);
		Bus bb45 = new Bus(45,"06:20", "����", "�λ�", 3);
		buslist.add(bb45);
		Bus bb46 = new Bus(46,"06:20", "����", "�λ�", 4);
		buslist.add(bb46);
		Bus bb47 = new Bus(47,"06:20", "����", "�λ�", 5);
		buslist.add(bb47);
		Bus bb48 = new Bus(48,"06:20", "����", "�λ�", 6);
		buslist.add(bb48);
		//�λ� 7:30�� ��
		Bus bb49 = new Bus(49,"07:30", "����", "�λ�", 0);
		buslist.add(bb49);
		Bus bb50 = new Bus(50,"07:30", "����", "�λ�", 1);
		buslist.add(bb50);
		Bus bb51 = new Bus(51,"07:30", "����", "�λ�", 2);
		buslist.add(bb51);
		Bus bb52 = new Bus(52,"07:30", "����", "�λ�", 3);
		buslist.add(bb52);
		Bus bb53 = new Bus(53,"07:30", "����", "�λ�", 4);
		buslist.add(bb53);
		Bus bb54 = new Bus(54,"07:30", "����", "�λ�", 5);
		buslist.add(bb54);
		Bus bb55 = new Bus(55,"07:30", "����", "�λ�", 6);
		buslist.add(bb55);
		//�λ� 8:45�� ��
		Bus bb56 = new Bus(56,"08:45", "����", "�λ�", 0);
		buslist.add(bb56);
		Bus bb57 = new Bus(57,"08:45", "����", "�λ�", 1);
		buslist.add(bb57);
		Bus bb58 = new Bus(58,"08:45", "����", "�λ�", 2);
		buslist.add(bb58);
		Bus bb59 = new Bus(59,"08:45", "����", "�λ�", 3);
		buslist.add(bb59);
		Bus bb60 = new Bus(60,"08:45", "����", "�λ�", 4);
		buslist.add(bb60);
		Bus bb61 = new Bus(61,"08:45", "����", "�λ�", 5);
		buslist.add(bb61);
		Bus bb62 = new Bus(62,"08:45", "����", "�λ�", 6);
		buslist.add(bb62);

	}

	public void busSelect(Client c) {
		Scanner sc = new Scanner(System.in);
		esc: while (true) {
			System.out.println("==============================");
			System.out.println("===�ֿ�����͹̳ο� ���Ű� ȯ���մϴ�===");
			System.out.println("==============================");
			System.out.println("[1].���� ����");
			System.out.println("[2].�������");
			System.out.println("[3].�޴���");
			System.out.println("==============================");
			int menu = sc.nextInt();

			switch (menu) {
			case 1:
				reserveBus(c);
				break;
			case 2:
				ckreserveBus(c);
				break;
			case 3:
				break esc;
			default:
				System.out.println("1~3 ������ �޴����ü��ڸ� �Է����ּ���");
			}
		}
	}

	private void reserveBus(Client c) {
		Scanner sc = new Scanner(System.in);
		System.out.println("=============================");
		System.out.println("============���� ����==========");
		System.out.println("=============================");
		System.out.println("����� : ����");
		System.out.println("�������� �����ϼ���");

		selectbus(c);

	}

	private void selectbus(Client c) {

		String startname= null;
		String time= null;
		Scanner sc = new Scanner(System.in);
		System.out.println("[1].�뱸 [2].���� [3].�λ�");
		int start = sc.nextInt();
		if (start == 1) {
			startname = "�뱸";
		} else if (start == 2) {
			startname = "����";
		} else {
			startname = "�λ�";
		}

		System.out.println("���ϴ� ��¥�� �����ϼ���(1~7��).");
		int startday = sc.nextInt();
		System.out.println(startday+"�� ����");
		System.out.println("���ϴ� �ð��� �����ϼ���.");
		System.out.println("[1]06:20 [2]07:30 [3]08:45");

		int stime = sc.nextInt();

		if (stime == 1) {
			time = "06:20";
		} else if (stime == 2) {
			time = "07:30";
		} else {
			time = "08:45";
		}
		for (int i = 0; i < buslist.size(); i++) {
			if(startname.equals(buslist.get(i).getEnd())
					&& startday==buslist.get(i).getStartday()
					&&time.equals(buslist.get(i).getStime()))
			{
				seatselect(buslist.get(i),c);
			}
		}
	}
	private void seatselect(Bus b, Client c) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < b.getSeat().length; i++) {
			System.out.print(b.getSeat()[i]);
			if((i+1)%10==0){
				System.out.println("");
			}
		}
		System.out.println("���ϴ� �¼��� �����ϼ���");

		int seatnum = sc.nextInt();
		if (b.getSeat()[seatnum - 1] == "[X]") {
			System.out.println("�̹��ִ��ڸ��Դϴ�.");
		} else {
			for (int i = 0; i < b.getSeat().length; i++) {
				if ((seatnum - 1) == i) {
					b.getSeat()[seatnum - 1] = "[X]";
				}
				System.out.print(b.getSeat()[i]);
				if ((i + 1) % 10 == 0) {
					System.out.println("");
				}
			}
			System.out.println("�ڸ����ÿϷ�!");
			int ReserveNo;
			if(rlist.size() == 0){
				ReserveNo=rlist.size()+1;
			}else{
				ReserveNo=rlist.get(rlist.size()-1).getReserveNo()+1;
			}
			Reserve r = new Reserve(ReserveNo,c.getMid(),seatnum,b.getBusNo(),b.getStartday(),b.getStime(),b.getEnd());
			rlist.add(r);
		}
	}
	private void ckreserveBus(Client c) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Reserve> reservelist = new ArrayList<>();
		if(!rlist.isEmpty()){
			for (int i = 0; i < rlist.size(); i++) {
				if(rlist.get(i).getRmid().equals(c.getMid())){
					reservelist.add(rlist.get(i));
				}
			}
			System.out.println("���� ��ȸ");
			int bs=0;
			for(Reserve r : reservelist){
				bs++;
				System.out.println("�����ȣ" + "[" + r.getReserveNo() + "]" + " " 
						+ "������ :" + r.getRmid()+ " "
						+ "������ ������ : "+r.getEnd()+ " "
						+ "������ ��¥ :"+(r.getBusday())+"��  "
						+"�����ѽð� :"+r.getBustime()+" "
						+ "�������¼� :"+r.getSeat() + "�� �¼�");
			}
			System.out.println("����� ���� ��ȣ�� �����ϼ���.");
			int rn = sc.nextInt();
			for (int i = 0; i < rlist.size(); i++) {
				if(reservelist.get(i).getReserveNo()==rn){
					removeSeat(reservelist.get(i));
					reservelist.remove(i);
					removeSeat(rlist.get(i));
					rlist.remove(i);

				}
			}
			System.out.println("������ҿϷ�");
		}else{
			System.out.println("������ �����ϴ�.");
		}
	}

	private void removeSeat(Reserve r) {
		for (int k = 0; k < rlist.size(); k++) {
			for (int j = 0; j < buslist.size(); j++) {
				if(r.getBusNo()==rlist.get(k).getBusNo()
						&& r.getBusday()==rlist.get(k).getBusday()
						&& r.getBustime().equals(rlist.get(k).getBustime()) 
						&& r.getSeat()==rlist.get(k).getSeat()){
					buslist.get(j).getSeat()[k]="["+(k+1)+"]";
				}
			}
		}
	}
	public void deleteBus(Client c) {
		if(rlist.size()!=0){
			for (int i = 0; i < rlist.size(); i++) {
				if(rlist.get(i).getRmid().equals(c.getMid())){
					removeSeat(rlist.get(i));
					rlist.remove(i);
					i--;
					
				}
			}
			System.out.println("ȸ��Ż�� �Ϸ�");
		}
	}
}