package com.cdac.employee;
import java.util.Iterator;

public class Tester {
	public static void main(String[] args) {
		

		Employee e1 = new Employee(1, "Piyush", "CS", 20000);
		Employee e2 = new Employee(2, "Vivek", "IT", 30000);

		Manager m1 = new Manager(1, "Tilak", "IT", 60000, 2000, 6);
		Manager m2 = new Manager(2, "Piyush", "Testing", 50000, 1000, 15);
		
		Developer d1 =new Developer(1, "Manoj", "Project Engineer", 60000, "Java, Python", 2);
		Developer d2 =new Developer(2, "Mrunali", "IT Engineer", 90000, "Selenium, Python", 3);

		Employee emp[] = new Employee[6];
		
		emp[0] = e1;
		emp[1] = e2;
		emp[2] = m1;
		emp[3] = m2;
		emp[4] = d1;
		emp[5] = d2;

		for (Employee i : emp) {
			i.displaDetails();
//			if(i instanceof Manager) {
//				((Manager) i).assignTask();
//			}
//			if(i instanceof Developer) {
//				((Developer) i).resolveBugs();
//			}
		}

	}

}
