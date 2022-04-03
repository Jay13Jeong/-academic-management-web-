package absence.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class Absence implements Serializable{
	private final long serialVersionUID = 6669L;
	private String requestid;
	private String studentid;
	private Date requestdate;
	private Date limitcanceldate;
	private String approval;
	
	public Absence() {
		super();
	}

	public Absence(String requestid, String studentid, Date requestdate, Date limitcanceldate,
			String approval) {
		super();
		this.requestid = requestid;
		this.studentid = studentid;
		this.requestdate = requestdate;
		this.limitcanceldate = limitcanceldate;
		this.approval = approval;
	}

	public String getRequestid() {
		return requestid;
	}

	public void setRequestid(String requestid) {
		this.requestid = requestid;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public Date getRequestdate() {
		return requestdate;
	}

	public void setRequestdate(Date requestdate) {
		this.requestdate = requestdate;
	}

	public Date getLimitcanceldate() {
		return limitcanceldate;
	}

	public void setLimitcanceldate(Date limitcanceldate) {
		this.limitcanceldate = limitcanceldate;
	}

	public String getApproval() {
		return approval;
	}

	public void setApproval(String approval) {
		this.approval = approval;
	}

	@Override
	public String toString() {
		return "Absence [requestid=" + requestid + ", studentid=" + studentid + ", requestdate=" + requestdate
				+ ", limitcanceldate=" + limitcanceldate + ", approval=" + approval
				+ "]";
	}


	
}
