package day6;

public class AirConditioner {
	
	String brand;
	double price;
	int temp;
	int warrantyyear;
	public AirConditioner(String brand, double price, int temp, int warrantyyear) {
		super();
		this.brand = brand;
		this.price = price;
		this.temp = 16;
		this.warrantyyear = warrantyyear;
	}
	
	
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}


	public String getBrand() {
		return brand;
	}



	@Override
	public String toString() {
		return "AirConditioner [brand=" + brand + ", price=" + price + ", warrantyyear="
				+ warrantyyear + "]";
	}
	
	
	
	

}
