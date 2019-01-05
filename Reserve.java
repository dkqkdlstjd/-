package sungbus;

public class Reserve {
	private int ReserveNo;
	private int busday;
	private String Rmid;
	private int Seat;
	private String bustime;
	private String end;
	private int busNo;
	
	public Reserve() {
		this(0,null,0,0,0,null,null);
	}
	
	public Reserve(int ReserveNo,String Rmid,int Seat,int busNo,int busday,String bustime,String end) {
		this.ReserveNo=ReserveNo;
		this.Rmid=Rmid;
		this.Seat=Seat;
		this.busNo=busNo;
		this.busday=busday;
		this.bustime=bustime;
		this.end=end;
	}

	public int getReserveNo() {
		return ReserveNo;
	}

	public void setReserveNo(int reserveNo) {
		ReserveNo = reserveNo;
	}

	public String getRmid() {
		return Rmid;
	}

	public void setRmid(String rmid) {
		Rmid = rmid;
	}

	public int getSeat() {
		return Seat;
	}

	public void setSeat(int seat) {
		Seat = seat;
	}

	public int getBusNo() {
		return busNo;
	}

	public void setBusNo(int busNo) {
		this.busNo = busNo;
	}

	public int getBusday() {
		return busday;
	}

	public void setBusday(int busday) {
		this.busday = busday;
	}

	public String getBustime() {
		return bustime;
	}

	public void setBustime(String bustime) {
		this.bustime = bustime;
	}

	public String getEnd() {
		return end;
	}

	public void setEnd(String end) {
		this.end = end;
	}
	

}
