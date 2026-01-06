package day8;

import java.util.List;

public class Student {

	String prn;
	String name;
	List<Integer> marks;
	public Student(String prn, String name, List<Integer> marks) {
		super();
		this.prn = prn;
		this.name = name;
		this.marks = marks;
	}
	
	
	
	public String getPrn() {
		return prn;
	}



	@Override
	public String toString() {
		return "Student [prn=" + prn + ", name=" + name + ", marks=" + marks + "]";
	}
	

}
