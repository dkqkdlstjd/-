package sungbus;


public class Bus {
	private int busNo;
	private String[] seat;
	private String start;
	private String end;
	private String stime;
	private int startday;
	//private String[]key={"06:20","07:30","08:45","10:00","11:00","12:30","13:30","15:00","16:10","17:10","18:20","19:30"};
	
	public Bus() {
		this(0,null,null,null,0);
	}
	public Bus(int busNo,String stime, String start,String end, int startday) {
		this.busNo=busNo;
		this.stime=stime;
		this.start=start;
		this.end=end;
		this.startday=startday;
		seat =new String[40];
		init();
	}
	
	public int getBusNo() {
		return busNo;
	}
	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public int getStartday() {
		return startday;
	}
	public void setStartday(int startday) {
		this.startday = startday;
	}

	private void init() {
		for (int i = 0; i < seat.length; i++) {
			seat[i]="["+(i+1)+"]";
		}
	}

	public String[] getSeat() {
		return seat;
	}

	public void setSeat(String[] seat) {
		this.seat = seat;
	}

	public String getStime() {
		return stime;
	}

	public void setStime(String stime) {
		this.stime = stime;
	}
	
}

