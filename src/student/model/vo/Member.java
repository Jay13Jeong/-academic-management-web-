package student.model.vo;

import java.sql.Date;

public class Member implements java.io.Serializable {
	private static final long serialVersionUID = 77463L;
	   private String id;
	   private String name;
	   private String ssn;
	   private String address;
	   private String phone;
	   private String gender;  //M 기본값
	   private String email;
	   private String treasure;
	   private java.sql.Date adminhiredate;
	   private String password;
	   private java.sql.Date entrancedate;  //sysdate 기본값
	   private String absencewhether;  //n 기본값
	   private int absencecount;     //0 기본값
	   private String ssname;
	   private String categoryname;
	   private String majorno;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	@Override
	public String toString() {
		return "Member [id=" + id + ", name=" + name + ", ssn=" + ssn + ", address=" + address + ", phone=" + phone
				+ ", gender=" + gender + ", email=" + email + ", treasure=" + treasure + ", adminhiredate="
				+ adminhiredate + ", password=" + password + ", entrancedate=" + entrancedate + ", absencewhether="
				+ absencewhether + ", absencecount=" + absencecount + ", ssname=" + ssname + ", categoryname="
				+ categoryname + ", majorno=" + majorno + "]";
	}
	public Member() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Member(String id, String name, String ssn, String address, String phone, String gender, String email,
			String treasure, Date adminhiredate, String password, Date entrancedate, String absencewhether,
			int absencecount, String ssname, String categoryname, String majorno) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.treasure = treasure;
		this.adminhiredate = adminhiredate;
		this.password = password;
		this.entrancedate = entrancedate;
		this.absencewhether = absencewhether;
		this.absencecount = absencecount;
		this.ssname = ssname;
		this.categoryname = categoryname;
		this.majorno = majorno;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTreasure() {
		return treasure;
	}
	public void setTreasure(String treasure) {
		this.treasure = treasure;
	}
	public Date getAdminhiredate() {
		return adminhiredate;
	}
	public void setAdminhiredate(Date adminhiredate) {
		this.adminhiredate = adminhiredate;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public java.sql.Date getEntrancedate() {
		return entrancedate;
	}
	public void setEntrancedate(java.sql.Date entrancedate) {
		this.entrancedate = entrancedate;
	}
	public String getAbsencewhether() {
		return absencewhether;
	}
	public void setAbsencewhether(String absencewhether) {
		this.absencewhether = absencewhether;
	}
	public int getAbsencecount() {
		return absencecount;
	}
	public void setAbsencecount(int absencecount) {
		this.absencecount = absencecount;
	}
	public String getSsname() {
		return ssname;
	}
	public void setSsname(String ssname) {
		this.ssname = ssname;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getMajorno() {
		return majorno;
	}
	public void setMajorno(String majorno) {
		this.majorno = majorno;
	}
}
