package major.model.vo;

public class Major implements java.io.Serializable{
	private static final long serialVersionUID=2222L;
	
	
	
	private String majorno;
	private String majorname;
	private int capacity;
	private int tuition ;
	private String categoryname; 
	
	public Major() {}

	public Major(String majorno, String majorname, int capacity, int tuition, String categoryname) {
		super();
		this.majorno = majorno;
		this.majorname = majorname;
		this.capacity = capacity;
		this.tuition = tuition;
		this.categoryname = categoryname;
	}

	public String getMajorno() {
		return majorno;
	}

	public void setMajorno(String majorno) {
		this.majorno = majorno;
	}

	public String getMajorname() {
		return majorname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Major [majorno=" + majorno + ", majorname=" + majorname + ", capacity=" + capacity + ", tuition="
				+ tuition + ", categoryname=" + categoryname + "]";
	}
	
	



}
