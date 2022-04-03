package ssbenefitst.model.vo;

import java.io.Serializable;

public class Ssbenefitst implements Serializable{
	private final long serialVersionUID = 6662L;
	private int benefitterm;
	private String studentid;
	private String ssname;
	
	public Ssbenefitst() {
		super();
	}

	public Ssbenefitst(int benefitterm, String studentid, String ssname) {
		super();
		this.benefitterm = benefitterm;
		this.studentid = studentid;
		this.ssname = ssname;
	}

	public int getBenefitterm() {
		return benefitterm;
	}

	public void setBenefitterm(int benefitterm) {
		this.benefitterm = benefitterm;
	}

	public String getStudentid() {
		return studentid;
	}

	public void setStudentid(String studentid) {
		this.studentid = studentid;
	}

	public String getSsname() {
		return ssname;
	}

	public void setSsname(String ssname) {
		this.ssname = ssname;
	}

	@Override
	public String toString() {
		return "Ssbenefitst [benefitterm=" + benefitterm + ", studentid=" + studentid + ", ssname=" + ssname + "]";
	}
	
	
}
