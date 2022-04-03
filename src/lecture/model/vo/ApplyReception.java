package lecture.model.vo;

public class ApplyReception implements java.io.Serializable{
	private final static long serialVersion = 3554455454L;
	private String receptionno;
	private String lcode;
	private String id;
	private String semester;
	private String lpersonnel;
	private String room;
	private String retake = "N";
	public String getReceptionno() {
		return receptionno;
	}
	public void setReceptionno(String receptionno) {
		this.receptionno = receptionno;
	}
	public String getLcode() {
		return lcode;
	}
	public void setLcode(String lcode) {
		this.lcode = lcode;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSemester() {
		return semester;
	}
	public void setSemester(String semester) {
		this.semester = semester;
	}
	public String getLpersonnel() {
		return lpersonnel;
	}
	public void setLpersonnel(String lpersonnel) {
		this.lpersonnel = lpersonnel;
	}
	public String getRoom() {
		return room;
	}
	public void setRoom(String room) {
		this.room = room;
	}
	public String getRetake() {
		return retake;
	}
	public void setRetake(String retake) {
		this.retake = retake;
	}
	@Override
	public String toString() {
		return "ApplyReception [receptionno=" + receptionno + ", lcode=" + lcode + ", id=" + id + ", semester="
				+ semester + ", lpersonnel=" + lpersonnel + ", room=" + room + ", retake=" + retake + "]";
	}
	public ApplyReception(String receptionno, String lcode, String id, String semester, String lpersonnel, String room,
			String retake) {
		super();
		this.receptionno = receptionno;
		this.lcode = lcode;
		this.id = id;
		this.semester = semester;
		this.lpersonnel = lpersonnel;
		this.room = room;
		this.retake = retake;
	}
	public ApplyReception() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
