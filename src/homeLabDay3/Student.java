package homeLabDay3;

public class Student {
	int rollNo;
	String name;
	int marks;
	
	public Student(int rollNo, String name, int marks) {
		super();
		this.rollNo = rollNo;
		this.name = name;
		this.marks = marks;
	}
	
	public void display() {
		System.out.println("Student [rollNo=" + rollNo + ", name=" + name + ", marks=" + marks + "]");
	}
	
	
}
