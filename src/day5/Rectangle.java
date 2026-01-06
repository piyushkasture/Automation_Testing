package day5;

public class Rectangle extends Shape {
	double width;
	double height;


	public Rectangle(String name, double width, double height) {
		super(name);
		this.width = width;
		this.height = height;
	}


	@Override
	public double getArea() {
		return width*height;
			// TODO Auto-generated method stub
		
	}

}
