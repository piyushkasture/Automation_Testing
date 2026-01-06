package day5;

import java.util.Scanner;

public class TestShape {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double rd= sc.nextDouble();
		
		Shape s1 = new Circle("Circle 1", rd);
		Circle c1 = new Circle("Circle 2", 9);
		System.out.println("Area of Circle: "+s1.getArea());
		System.out.println("Area of Circle: "+c1.getArea());
	
		
		System.out.println("Enter Width: ");
		double wd= sc.nextDouble();
		
		System.out.println("Enter Height: ");
		double hi= sc.nextDouble();
		
		Shape s2 = new Rectangle("Rectangle 1", 10, 20);
		Rectangle c2 = new Rectangle("Rectangle 2", wd, hi);
		
		
		System.out.println("Area of Rectangle: "+s2.getArea());
		System.out.println("Area of Rectangle: "+c2.getArea());
		
	}
	
	
	

}
