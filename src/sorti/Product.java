package sorti;

public class Product implements Comparable<Product>{
	
	int id;
	String name;
	double price;
	public Product(int id, String name, double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	
	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + "]";
	}


//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
////		return Integer.compare(this.id, o.id);
//		return this.name.compare(this.name, o.price);
//		
//	}
//	
	@Override
	public int compareTo(Product o) {
	    return this.name.compareTo(o.name);
	}
	

}
