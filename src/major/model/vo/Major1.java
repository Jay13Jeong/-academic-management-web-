package major.model.vo;

public class Major1 implements java.io.Serializable{
	private static final long serialVersionUID=222222L;
	
	
	
	
	private String categoryname;
	 private String majorname;
	 private String id;
	 private String name;
	 private int tuition;
	 
	public Major1() {
		super();
	}

	public Major1(String categoryname, String majorname, String id, String name, int tuition) {
		super();
		this.categoryname = categoryname;
		this.majorname = majorname;
		this.id = id;
		this.name = name;
		this.tuition = tuition;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getMajorname() {
		return majorname;
	}

	public void setMajorname(String majorname) {
		this.majorname = majorname;
	}

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

	public int getTuition() {
		return tuition;
	}

	public void setTuition(int tuition) {
		this.tuition = tuition;
	}

	@Override
	public String toString() {
		return "Major1 [categoryname=" + categoryname + ", majorname=" + majorname + ", id=" + id + ", name=" + name
				+ ", tuition=" + tuition + "]";
	}
	 

	 
}
