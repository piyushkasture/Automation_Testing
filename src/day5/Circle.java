package day5;

public class Circle extends Shape {
	double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}



	@Override
	public double getArea() {
		return 3.14*radius*radius;
		
		// TODO Auto-generated method stub
		
	}

}
