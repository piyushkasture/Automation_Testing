package day5;

public abstract class Shape {
	String name;

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	public void displayName() {
		System.out.println("Name: "+name);
		
	}
	public abstract double getArea();

}
