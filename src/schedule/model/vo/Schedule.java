package schedule.model.vo;

import java.sql.Date;

public class Schedule implements java.io.Serializable{
	private static final long serialVersionUID = 2222L;

	private String scheduleid;
	private String adno;
	private String schname;
	private int schstartyear;
	private int schstartmonth;
	private int schstartdate;
	private int schendyear;
	private int schendmonth;
	private int schenddate;
	
	public Schedule() {}

	public Schedule(String scheduleid, String adno, String schname, int schstartyear, int schstartmonth,
			int schstartdate, int schendyear, int schendmonth, int schenddate) {
		super();
		this.scheduleid = scheduleid;
		this.adno = adno;
		this.schname = schname;
		this.schstartyear = schstartyear;
		this.schstartmonth = schstartmonth;
		this.schstartdate = schstartdate;
		this.schendyear = schendyear;
		this.schendmonth = schendmonth;
		this.schenddate = schenddate;
	}

	public String getScheduleid() {
		return scheduleid;
	}

	public void setScheduleid(String scheduleid) {
		this.scheduleid = scheduleid;
	}

	public String getAdno() {
		return adno;
	}

	public void setAdno(String adno) {
		this.adno = adno;
	}

	public String getSchname() {
		return schname;
	}

	public void setSchname(String schname) {
		this.schname = schname;
	}

	public int getSchstartyear() {
		return schstartyear;
	}

	public void setSchstartyear(int schstartyear) {
		this.schstartyear = schstartyear;
	}

	public int getSchstartmonth() {
		return schstartmonth;
	}

	public void setSchstartmonth(int schstartmonth) {
		this.schstartmonth = schstartmonth;
	}

	public int getSchstartdate() {
		return schstartdate;
	}

	public void setSchstartdate(int schstartdate) {
		this.schstartdate = schstartdate;
	}

	public int getSchendyear() {
		return schendyear;
	}

	public void setSchendyear(int schendyear) {
		this.schendyear = schendyear;
	}

	public int getSchendmonth() {
		return schendmonth;
	}

	public void setSchendmonth(int schendmonth) {
		this.schendmonth = schendmonth;
	}

	public int getSchenddate() {
		return schenddate;
	}

	public void setSchenddate(int schenddate) {
		this.schenddate = schenddate;
	}

	@Override
	public String toString() {
		return "Schedule [scheduleid=" + scheduleid + ", adno=" + adno + ", schname=" + schname + ", schstartyear="
				+ schstartyear + ", schstartmonth=" + schstartmonth + ", schstartdate=" + schstartdate + ", schendyear="
				+ schendyear + ", schendmonth=" + schendmonth + ", schenddate=" + schenddate + "]";
	}


	
}
