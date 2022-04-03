package termScore.model.vo;

public class TermScore implements java.io.Serializable{
	private static final long SerialVersionUID = 456115124L;
	
	private String semester; 
	private String sid;
	private String sname;
	private String cateogoryname;
	private String majorname;
	private int termaplpoint;
	private int termgetpoint;
	private int grdpoint;
	private double tgpa;
	
	public TermScore() {}
	
	public TermScore(String semester, String sid, String sname, String cateogoryname, String majorname,
			int termaplpoint, int termgetpoint, int grdpoint, double tgpa) {
		super();
		this.semester = semester;
		this.sid = sid;
		this.sname = sname;
		this.cateogoryname = cateogoryname;
		this.majorname = majorname;
		this.termaplpoint = termaplpoint;
		this.termgetpoint = termgetpoint;
		this.grdpoint = grdpoint;
		this.tgpa = tgpa;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCateogoryname(String cateogoryname) {
		this.cateogoryname = cateogoryname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public void setTermaplpoint(int termaplpoint) {
		this.termaplpoint = termaplpoint;
	}

	public void setTermgetpoint(int termgetpoint) {
		this.termgetpoint = termgetpoint;
	}

	public void setGrdpoint(int grdpoint) {
		this.grdpoint = grdpoint;
	}

	public void setTgpa(double tgpa) {
		this.tgpa = tgpa;
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	public String getSemester() {
		return semester;
	}

	public String getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getCateogoryname() {
		return cateogoryname;
	}

	public String getMajorname() {
		return majorname;
	}

	public int getTermaplpoint() {
		return termaplpoint;
	}

	public int getTermgetpoint() {
		return termgetpoint;
	}

	public int getGrdpoint() {
		return grdpoint;
	}

	public double getTgpa() {
		return tgpa;
	}

	@Override
	public String toString() {
		return "TermScore [semester=" + semester + ", sid=" + sid + ", sname=" + sname + ", cateogoryname="
				+ cateogoryname + ", majorname=" + majorname + ", termaplpoint=" + termaplpoint + ", termgetpoint="
				+ termgetpoint + ", grdpoint=" + grdpoint + ", tgpa=" + tgpa + "]";
	}
	
	
	
}
