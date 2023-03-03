package SetWithUserDefinedClass;

public class Laptop {

	private int laptopId; 
	private String laptopBrand;
	private String modelNumber; 
	private int price;
	public Laptop(int laptopId, String laptopBrand, String modelNumber, int price) {
		super();
		this.laptopId = laptopId;
		this.laptopBrand = laptopBrand;
		this.modelNumber = modelNumber;
		this.price = price;
	}
	
	
	private static int laptopCount = 1;
	
	public int getLaptopId() {
		return laptopId;
	}
	public void setLaptopId(int laptopId) {
		this.laptopId = laptopId;
	}
	public String getLaptopBrand() {
		return laptopBrand;
	}
	public void setLaptopBrand(String laptopBrand) {
		this.laptopBrand = laptopBrand;
	}
	public String getModelNumber() {
		return modelNumber;
	}
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public static int getLaptopCount() {
		return laptopCount;
	}
	public static void setLaptopCount(int laptopCount) {
		Laptop.laptopCount = laptopCount;
	} 
	
	@Override
	public String toString() {
		return "Laptop"+laptopCount+" [laptopId=" + laptopId + ", laptopBrand=" + laptopBrand + ", modelNumber=" + modelNumber
				+ ", price=" + price + "]";
	} 
	
}
