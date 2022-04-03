package scholarship.model.vo;

import java.io.Serializable;

public class Scholarship implements Serializable{
	private final long serialVersionUID = 6661L;
	private String ssname;
	private String benefitcon;
	private int value;

	public Scholarship() {
		super();
	}

	public Scholarship(String ssname, String benefitcon, int value) {
		super();
		this.ssname = ssname;
		this.benefitcon = benefitcon;
		this.value = value;
	}

	public String getSsname() {
		return ssname;
	}

	public void setSsname(String ssname) {
		this.ssname = ssname;
	}

	public String getBenefitcon() {
		return benefitcon;
	}

	public void setBenefitcon(String benefitcon) {
		this.benefitcon = benefitcon;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Scholarship [ssname=" + ssname + ", benefitcon=" + benefitcon + ", value=" + value + "]";
	}
	
	
	
}
