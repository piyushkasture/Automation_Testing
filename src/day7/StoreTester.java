package day7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class StoreTester {
	
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		 
		 Set<Store> storeSet = new HashSet<>();
		 
		 List<String> inventoryList = new ArrayList<>();
		 inventoryList.add("Besan");
		 inventoryList.add("Sugar");
		 inventoryList.add("Bescuit");
		 inventoryList.add("Chips");
		 inventoryList.add("Bread");
		 inventoryList.add("Milk");
		 inventoryList.add("Cheese");
		 inventoryList.add("Paneer");
		 
		 
		 Store s1 = new Store("Dmart", 0, "Pune", "3266885554", inventoryList);
//		 s1.inverntory.add("Besan");
//		 s1.inverntory.add("Sugar");
//		 s1.inverntory.add("Bescuit");
//		 s1.inverntory.add("Chips");
		 
		 Store s2 = new Store("JioMart", 0, "Pune", "2598245541", inventoryList);
		 Store s5 = new Store("askdkfe", 0, "Nagpur", "245426687", inventoryList);
//		 s2.inverntory.add("Bread");
//		 s2.inverntory.add("Milk");
//		 s2.inverntory.add("Cheese");
//		 s2.inverntory.add("Paneer");
		 
		
		 
		 
		 Store s3 = new Store("Zudio", 0, "Mumbai", "235684525");
		 Store s4 = new Store("Zudio", 0, "Delhi", "12356854654");
		 
		 storeSet.add(s3);
		 storeSet.add(s2);
		 storeSet.add(s1);
		 storeSet.add(s4);
		 storeSet.add(s5);
		 
		 for(Store s: storeSet) {
			 System.out.println(s);
		 }
		 
		 System.out.println("Remove");
		 
		 Set<Store> removeStores = new HashSet<>();
		 
		 for(Store i: storeSet) {
			 if (i.getLocation().equals("Delhi")) {
//				storeSet.remove(i);
				removeStores.add(i);
			}
		 }
		 storeSet.removeAll(removeStores);
		 
		 //by empty list
		 for(Store s: storeSet) {
			 if(s.inverntory.isEmpty()) {
				 removeStores.add(s);
			 }
		 }
		 storeSet.removeAll(removeStores);
		 
//		 by id
		 for(Store i: storeSet) {
			 if (i.getStoreID()==3) {
//				storeSet.remove(i);
				removeStores.add(i);
			}
		 }
		 storeSet.removeAll(removeStores);
		 
		 
		 for(Store s: storeSet) {
			 System.out.println(s);
		 }
		 
	}

}
