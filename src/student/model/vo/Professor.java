package student.model.vo;

import java.sql.Date;

public class Professor extends Member implements java.io.Serializable {
	private static final long serialVersionUID = 4545334L;
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
		return "Professor [id=" + id + ", name=" + name + ", ssn=" + ssn + ", address=" + address + ", phone=" + phone
				+ ", gender=" + gender + ", email=" + email + ", treasure=" + treasure + ", categoryname="
				+ categoryname + ", majorno=" + majorno + ", entrancedate=" + entrancedate + ", absencewhether="
				+ absencewhether + ", absencecount=" + absencecount + ", ssname=" + ssname + ", password=" + password
				+ "]";
	}
	public Professor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Professor(String id, String name, String ssn, String address, String phone, String gender, String email,
			String treasure, String categoryname, String majorno, Date entrancedate, String absencewhether,
			int absencecount, String ssname, String password) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.phone = phone;
		this.gender = gender;
		this.email = email;
		this.treasure = treasure;
		this.categoryname = categoryname;
		this.majorno = majorno;
		this.entrancedate = entrancedate;
		this.absencewhether = absencewhether;
		this.absencecount = absencecount;
		this.ssname = ssname;
		this.password = password;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	private String id;
	   private String name;
	   private String ssn;
	   private String address;
	   private String phone;
	   private String gender;
	   private String email;
	   private String treasure;
	   private String categoryname;
	   private String majorno;
	   private java.sql.Date entrancedate;
	   private String absencewhether;
	   private int absencecount;
	   private String ssname;
	   private String password;
}
