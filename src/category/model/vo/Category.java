package category.model.vo;

import java.io.Serializable;

public class Category implements Serializable{
	private final long serialVersionUID = 6666L;
	private String categoryname;
	
	public Category() {}

	public Category(String categoryname) {
		this.categoryname = categoryname;
	}

	public String getCategoryname() {
		return categoryname;
	}

	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}

	@Override
	public String toString() {
		return "Category [categoryname=" + categoryname + "]";
	};
	
	
}
