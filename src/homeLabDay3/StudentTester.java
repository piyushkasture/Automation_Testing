package homeLabDay3;

public class StudentTester {
	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Piyush", 75);
		Student s2 = new Student(2, "Tilak", 89);
		Student s3 = new Student(3, "Vivek", 95);
		Student s4 = new Student(4, "Vish", 89);
		Student s5 = new Student(5, "Manoj", 75);
		
		
		Student stu[] = new Student[5] ;
		
//		for (int i = 0; i < stu.length; i++) {
//			stu[i] = ()
//			
//		}	
		
		stu[0] = s1;
		stu[1] = s2;
		stu[2] = s3;
		stu[3] = s4;
		stu[4] = s5;
	
		for(Student s :stu) {
			s.display();
		}
		
		for (int i = 0; i < stu.length; i++) {
			
		}
	}
}
