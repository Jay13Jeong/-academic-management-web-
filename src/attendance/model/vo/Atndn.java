 package attendance.model.vo;

import lecture.model.vo.Lecture;

public class Atndn extends Lecture  implements java.io.Serializable {
	private final static long serialVersionUID = 456456L;
	private String lcode;
	private String sid;
	private String thisweek;
	private String absent3;
	
	//join용  
	private String semester;
	private String sname;
	private String majorname;
	private int lpoint;
	private String category;
	private String pname;
	private String pid;
	private String receptionno;

	private String week1;
	private String week2;
	private String week3;
	private String week4;
	private String week5;
	private String week6;
	private String week7;
	private String week8;
	private String week9;
	private String week10;
	private String week11;
	private String week12;
	private String week13;
	private String week14;
	private String week15;
	private String week16;

	public Atndn() {
		// TODO Auto-generated constructor stub
	}

	public Atndn(String lcode, String lname, String category, int capacity, String content, String lclock, String name,
			String ltime, String professorid, String room, String lcode2, String sid, String thisweek, String absent3,
			String semester, String sname, String majorname, int lpoint, String category2, String pname, String pid,
			String receptionno, String week1, String week2, String week3, String week4, String week5, String week6,
			String week7, String week8, String week9, String week10, String week11, String week12, String week13,
			String week14, String week15, String week16) {
		super(lcode, lname, category, capacity, content, lclock, name, ltime, professorid, room);
		lcode = lcode2;
		this.sid = sid;
		this.thisweek = thisweek;
		this.absent3 = absent3;
		this.semester = semester;
		this.sname = sname;
		this.majorname = majorname;
		this.lpoint = lpoint;
		category = category2;
		this.pname = pname;
		this.pid = pid;
		this.receptionno = receptionno;
		this.week1 = week1;
		this.week2 = week2;
		this.week3 = week3;
		this.week4 = week4;
		this.week5 = week5;
		this.week6 = week6;
		this.week7 = week7;
		this.week8 = week8;
		this.week9 = week9;
		this.week10 = week10;
		this.week11 = week11;
		this.week12 = week12;
		this.week13 = week13;
		this.week14 = week14;
		this.week15 = week15;
		this.week16 = week16;
	}

	public void setLcode(String lcode) {
		this.lcode = lcode;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setThisweek(String thisweek) {
		this.thisweek = thisweek;
	}

	public void setAbsent3(String absent3) {
		this.absent3 = absent3;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public void setLpoint(int lpoint) {
		this.lpoint = lpoint;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setReceptionno(String receptionno) {
		this.receptionno = receptionno;
	}

	public void setWeek1(String week1) {
		this.week1 = week1;
	}

	public void setWeek2(String week2) {
		this.week2 = week2;
	}

	public void setWeek3(String week3) {
		this.week3 = week3;
	}

	public void setWeek4(String week4) {
		this.week4 = week4;
	}

	public void setWeek5(String week5) {
		this.week5 = week5;
	}

	public void setWeek6(String week6) {
		this.week6 = week6;
	}

	public void setWeek7(String week7) {
		this.week7 = week7;
	}

	public void setWeek8(String week8) {
		this.week8 = week8;
	}

	public void setWeek9(String week9) {
		this.week9 = week9;
	}

	public void setWeek10(String week10) {
		this.week10 = week10;
	}

	public void setWeek11(String week11) {
		this.week11 = week11;
	}

	public void setWeek12(String week12) {
		this.week12 = week12;
	}

	public void setWeek13(String week13) {
		this.week13 = week13;
	}

	public void setWeek14(String week14) {
		this.week14 = week14;
	}

	public void setWeek15(String week15) {
		this.week15 = week15;
	}

	public void setWeek16(String week16) {
		this.week16 = week16;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getLcode() {
		return lcode;
	}

	public String getSid() {
		return sid;
	}

	public String getThisweek() {
		return thisweek;
	}

	public String getAbsent3() {
		return absent3;
	}

	public String getSemester() {
		return semester;
	}

	public String getSname() {
		return sname;
	}

	public String getMajorname() {
		return majorname;
	}

	public int getLpoint() {
		return lpoint;
	}

	public String getCategory() {
		return category;
	}

	public String getPname() {
		return pname;
	}

	public String getPid() {
		return pid;
	}

	public String getReceptionno() {
		return receptionno;
	}

	public String getWeek1() {
		return week1;
	}

	public String getWeek2() {
		return week2;
	}

	public String getWeek3() {
		return week3;
	}

	public String getWeek4() {
		return week4;
	}

	public String getWeek5() {
		return week5;
	}

	public String getWeek6() {
		return week6;
	}

	public String getWeek7() {
		return week7;
	}

	public String getWeek8() {
		return week8;
	}

	public String getWeek9() {
		return week9;
	}

	public String getWeek10() {
		return week10;
	}

	public String getWeek11() {
		return week11;
	}

	public String getWeek12() {
		return week12;
	}

	public String getWeek13() {
		return week13;
	}

	public String getWeek14() {
		return week14;
	}

	public String getWeek15() {
		return week15;
	}

	public String getWeek16() {
		return week16;
	}

	@Override
	public String toString() {
		return "Atndn [lcode=" + lcode + ", sid=" + sid + ", thisweek=" + thisweek + ", absent3=" + absent3
				+ ", semester=" + semester + ", sname=" + sname + ", majorname=" + majorname + ", lpoint=" + lpoint
				+ ", category=" + category + ", pname=" + pname + ", pid=" + pid + ", receptionno=" + receptionno
				+ ", week1=" + week1 + ", week2=" + week2 + ", week3=" + week3 + ", week4=" + week4 + ", week5=" + week5
				+ ", week6=" + week6 + ", week7=" + week7 + ", week8=" + week8 + ", week9=" + week9 + ", week10="
				+ week10 + ", week11=" + week11 + ", week12=" + week12 + ", week13=" + week13 + ", week14=" + week14
				+ ", week15=" + week15 + ", week16=" + week16 + "]";
	}

	

	

	
}
