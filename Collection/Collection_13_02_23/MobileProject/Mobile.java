package MobileProject;

public class Mobile implements Comparable<Mobile> {
	
	private int mobile_id; 
	private String brand; 
	private Integer model_no; 
	private int weight;
	public Mobile(int mobile_id, String brand, Integer model_no, int weight) {
		super();
		this.mobile_id = mobile_id;
		this.brand = brand;
		this.model_no = model_no;
		this.weight = weight;
	}

	
	
	@Override
	public String toString() {
		return "Mobile [mobile_id=" + mobile_id + ", brand=" + brand + ", model_no=" + model_no + ", weight=" + weight
				+ "]";
	}



	public int getMobile_id() {
		return mobile_id;
	}
	public void setMobile_id(int mobile_id) {
		this.mobile_id = mobile_id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public Integer getModel_no() {
		return model_no;
	}
	public void setModel_no(Integer model_no) {
		this.model_no = model_no;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	} 
	
	@Override
	public int compareTo(Mobile ob) {
		if(this.mobile_id < ob.mobile_id) {
			return 1; 
		}
		else if(this.mobile_id > ob.mobile_id) {
			return -1; 
		}
		else {
			return 0; 
		}
	}
	
//	@Override
//	public int compareTo(Mobile o) {
//		return this.getBrand().compareTo(o.brand); 
//	}
//	
	

}
