package lectureScore.model.vo;

public class LectureScore implements java.io.Serializable{
	private static final long SerialVersionUID = 45612L;
	
	private String receptionno;
	private String sid;
	private String sname;
	private String categoryname;
	private String majorname;
	private String semester;
	private String lcode;
	private String lname;
	private String category;
	private int lpoint;
	private String retake;
	private int atndnscore;
	private int midscore;
	private int finalscore;
	private int totalscore;
	private String grade;
	private String pid;
	private String pname;
	private int capacity;
	
	public LectureScore() {}

	public LectureScore(String receptionno, String sid, String sname, String categoryname, String majorname,
			String semester, String lcode, String lname, String category, int lpoint, String retake, int atndnscore,
			int midscore, int finalscore, int totalscore, String grade, String pid, String pname, int capacity) {
		super();
		this.receptionno = receptionno;
		this.sid = sid;
		this.sname = sname;
		this.categoryname = categoryname;
		this.majorname = majorname;
		this.semester = semester;
		this.lcode = lcode;
		this.lname = lname;
		this.category = category;
		this.lpoint = lpoint;
		this.retake = retake;
		this.atndnscore = atndnscore;
		this.midscore = midscore;
		this.finalscore = finalscore;
		this.totalscore = totalscore;
		this.grade = grade;
		this.pid = pid;
		this.pname = pname;
		this.capacity = capacity;
	}

	public void setReceptionno(String receptionno) {
		this.receptionno = receptionno;
	}

	public void setSid(String sid) {
		this.sid = sid;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public void setSemester(String semester) {
		this.semester = semester;
	}

	public void setLcode(String lcode) {
		this.lcode = lcode;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setLpoint(int lpoint) {
		this.lpoint = lpoint;
	}

	public void setRetake(String retake) {
		this.retake = retake;
	}

	public void setAtndnscore(int atndnscore) {
		this.atndnscore = atndnscore;
	}

	public void setMidscore(int midscore) {
		this.midscore = midscore;
	}

	public void setFinalscore(int finalscore) {
		this.finalscore = finalscore;
	}

	public void setTotalscore(int totalscore) {
		this.totalscore = totalscore;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public static long getSerialversionuid() {
		return SerialVersionUID;
	}

	public String getReceptionno() {
		return receptionno;
	}

	public String getSid() {
		return sid;
	}

	public String getSname() {
		return sname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public String getMajorname() {
		return majorname;
	}

	public String getSemester() {
		return semester;
	}

	public String getLcode() {
		return lcode;
	}

	public String getLname() {
		return lname;
	}

	public String getCategory() {
		return category;
	}

	public int getLpoint() {
		return lpoint;
	}

	public String getRetake() {
		return retake;
	}

	public int getAtndnscore() {
		return atndnscore;
	}

	public int getMidscore() {
		return midscore;
	}

	public int getFinalscore() {
		return finalscore;
	}

	public int getTotalscore() {
		return totalscore;
	}

	public String getGrade() {
		return grade;
	}

	public String getPid() {
		return pid;
	}

	public String getPname() {
		return pname;
	}

	public int getCapacity() {
		return capacity;
	}

	@Override
	public String toString() {
		return "LectureScore [receptionno=" + receptionno + ", sid=" + sid + ", sname=" + sname + ", categoryname="
				+ categoryname + ", majorname=" + majorname + ", semester=" + semester + ", lcode=" + lcode + ", lname="
				+ lname + ", category=" + category + ", lpoint=" + lpoint + ", retake=" + retake + ", atndnscore="
				+ atndnscore + ", midscore=" + midscore + ", finalscore=" + finalscore + ", totalscore=" + totalscore
				+ ", grade=" + grade + ", pid=" + pid + ", pname=" + pname + ", capacity=" + capacity + "]";
	}

	
	
	
}

