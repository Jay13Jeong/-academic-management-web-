package lecture.model.vo;

import java.sql.Date;

//휴보강객체
public class Rest implements java.io.Serializable{
	private final static long serialVersionUID = 354565656;
	private String receptionno;
	private String id;
	private String reason;
	private String way;
	private Date dayoff;
	private Date rday;
	private String rtime;
	private String lcode;
	private String room;
	private String subid;
	
	public Rest() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Rest(String receptionno, String id, String reason, String way, Date dayoff, Date rday, String rtime,
			String lcode, String room, String subid) {
		super();
		this.receptionno = receptionno;
		this.id = id;
		this.reason = reason;
		this.way = way;
		this.dayoff = dayoff;
		this.rday = rday;
		this.rtime = rtime;
		this.lcode = lcode;
		this.room = room;
		this.subid = subid;
	}



	public String getReceptionno() {
		return receptionno;
	}



	public void setReceptionno(String receptionno) {
		this.receptionno = receptionno;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getReason() {
		return reason;
	}



	public void setReason(String reason) {
		this.reason = reason;
	}



	public String getWay() {
		return way;
	}



	public void setWay(String way) {
		this.way = way;
	}



	public Date getDayoff() {
		return dayoff;
	}



	public void setDayoff(Date dayoff) {
		this.dayoff = dayoff;
	}



	public Date getRday() {
		return rday;
	}



	public void setRday(Date rday) {
		this.rday = rday;
	}



	public String getRtime() {
		return rtime;
	}



	public void setRtime(String rtime) {
		this.rtime = rtime;
	}



	public String getLcode() {
		return lcode;
	}



	public void setLcode(String lcode) {
		this.lcode = lcode;
	}



	public String getRoom() {
		return room;
	}



	public void setRoom(String room) {
		this.room = room;
	}



	public String getSubid() {
		return subid;
	}



	public void setSubid(String subid) {
		this.subid = subid;
	}



	@Override
	public String toString() {
		return "Rest [receptionno=" + receptionno + ", id=" + id + ", reason=" + reason + ", way=" + way + ", dayoff="
				+ dayoff + ", rday=" + rday + ", rtime=" + rtime + ", lcode=" + lcode + ", room=" + room + ", subid="
				+ subid + "]";
	}
	
	
}
