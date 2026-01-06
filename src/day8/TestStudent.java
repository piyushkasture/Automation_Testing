package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TestStudent {

	public static void main(String[] args) {
		Map<String, Student> studentMap = new LinkedHashMap<>();
		
//		List<Integer> marks = new ArrayList<>();
//		marks.add()
		
		//1
		List<Integer> marks1 = new ArrayList<>();
		Student s1 = new Student("202508007", "Piyush", marks1);
		marks1.add(88);
		marks1.add(69);
		marks1.add(78);
		marks1.add(89);
		
		//2
		List<Integer> marks2 = new ArrayList<>();
		Student s2 = new Student("202508009", "Tilak", marks2);
		marks2.add(66);
		marks2.add(77);
		marks2.add(44);
		marks2.add(45);
		
		//3
		List<Integer> marks3 = new ArrayList<>();
		Student s3 = new Student("202508008", "Vivek", marks3);
		marks3.add(90);
		marks3.add(99);
		marks3.add(40);
		marks3.add(20);
		
		//4
		List<Integer> marks4 = new ArrayList<>();
		Student s4 = new Student("202508005", "Vish", marks4);
		marks4.add(89);
		marks4.add(61);
		marks4.add(72);
		marks4.add(83);
		
		//5
		List<Integer> marks5 = new ArrayList<>();
		Student s5 = new Student("202508004", "Manoj", marks5);
		marks5.add(85);
		marks5.add(66);
		marks5.add(77);
		marks5.add(88);
		
		//6
		List<Integer> marks6 = new ArrayList<>();
		Student s6 = new Student("202508001", "sahil", marks6);
		marks6.add(81);
		marks6.add(62);
		marks6.add(73);
		marks6.add(84);
		
		
		studentMap.put("202508007", s1);
		studentMap.put("202508009", s2);
		studentMap.put("202508008", s3);
		studentMap.put("202508005", s4);
		studentMap.put("202508004", s5);
		studentMap.put("202508004", s6);
		studentMap.put("202508007", s1);
		
//		studentMap.put(s1.getPrn(), s1);
//        studentMap.put(s2.getPrn(), s2);
//        studentMap.put(s3.getPrn(), s3);
//        studentMap.put(s4.getPrn(), s4);
//        studentMap.put(s5.getPrn(), s5);
//        studentMap.put(s6.getPrn(), s6);



		// Added
		System.out.println("Added");

		for (Map.Entry<String, Student> entry : studentMap.entrySet()) {

			System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
			;
		}

		// Remove
//		studentMap.remove("202508009" ,s2);
//		studentMap.remove("202508004");
//		
//
//		System.out.println("Remove");
//
//		for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
//
//			System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
//			;
//		}
//		
//		//Replace
//		
//		
//		Student s7 = new Student("202508007", "kopa", marks);
//		studentMap.replace("202508007", s7);
//		
//		
//
//		System.out.println("Replace");
//
//		for (Map.Entry<String, Student> entry : studentMap.entrySet()) {
//
//			System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
//			;
//		}

		// %
		System.out.println("Percentage");
		for (Map.Entry<String, Student> entry : studentMap.entrySet()) {

			int sum = 0;
			for (int m : entry.getValue().marks) {
				sum += m;
			}

			double percentage = (sum / 400.0) * 100;

			System.out.println("PRN: " + entry.getValue().getPrn() + " Percentage: " + percentage);
		}

	}

}
