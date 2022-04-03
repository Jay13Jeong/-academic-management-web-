package major.model.vo;




public class Major2 implements java.io.Serializable{
	private static final long serialVersionUID=22222L;

	
		private int value ;
		private int benefitterm;
		
		public Major2() {
			
			super();
		}

		

		public Major2(int value, int benefitterm) {
			super();
			this.value = value;
			this.benefitterm = benefitterm;
		}



		

		public int getValue() {
			return value;
		}



		public void setValue(int value) {
			this.value = value;
		}



		public int getBenefitterm() {
			return benefitterm;
		}



		public void setBenefitterm(int benefitterm) {
			this.benefitterm = benefitterm;
		}



		public static long getSerialversionuid() {
			return serialVersionUID;
		}



		@Override
		public String toString() {
			return "Major2 [value=" + value + ", benefitterm=" + benefitterm + "]";
		}



		
		
}
