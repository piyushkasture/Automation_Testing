package day6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class TestAC {
	public static void main(String[] args) {
		
		 Scanner sc =new Scanner(System.in);
		 
		ArrayList<AirConditioner> ac = new ArrayList<AirConditioner>();
		
		AirConditioner a1 = new AirConditioner("Daikin", 15999, 0, 1);
		AirConditioner a2 = new AirConditioner("LG", 25999, 0, 2);
		AirConditioner a3 = new AirConditioner("Voltas", 19999, 0, 5);
		AirConditioner a4 = new AirConditioner("Hitachi", 28999, 0, 1);
		
		ac.add(a1);
		ac.add(0, a2);
		ac.add(a3);
		ac.add(a4);
//		
//		for(AirConditioner i : ac) {
//			System.out.println(i);
//		}
//		
//		//remove
//		ac.remove(1);
//		ac.remove(a4);
//		
//		System.out.println("Remove element");
//		
//		for(AirConditioner i : ac) {
//			System.out.println(i);
//		}
		
		//set
//		ac.get(1);
//		System.out.println(ac.get(1));
//		
//		System.out.println("set");
//		ac.set(0, a4);
//		
//		for(AirConditioner i : ac) {
//			System.out.println(i);
//		}
		
//		//clear
//		System.out.println("clear");
//		ac.clear();
//		
//		for(AirConditioner i : ac) {
//			System.out.println(i);
//		}
		
		//removefirst
//		
//		System.out.println("first");
//		ac.removeFirst();
		
//	    ac.indexOf(a1);
//	    System.out.println(ac.indexOf(a2));
//	    
//	    
//		AirConditioner a5 = new AirConditioner("LG", 59999, 0, 2);
//		ac.set(0, a5);
//		
//		for(AirConditioner i : ac) {
//			System.out.println(i);
//		}
		
		System.out.println("Enter brand name:");
		String brd = sc.next();
		
		
		for (AirConditioner airc: ac) {
			if (airc.getBrand().equals(brd)) {
			    System.out.println("Enter new price: ");
			    double price = sc.nextDouble();
			    airc.setPrice(price);
			    break;
			}
			
			else {
				System.out.println("Not found");
//				break;
			}
		}
	    
		for(AirConditioner i : ac) {
			System.out.println(i);
		}
	}

}
