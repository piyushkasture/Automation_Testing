package day8;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class TestProduct {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Map<String, Map<String, Double>> grocery = new LinkedHashMap<>();

		Map<String, Double> fruits = new LinkedHashMap<>();
//		fruits.put("Apple", 12.0);

		Map<String, Double> dairy = new LinkedHashMap<>();
//		dairy.put("Milk", 55.0);

//		grocery.put("Fruits", fruits);
//		grocery.put("Dairy", dairy);

		TestProduct tp = new TestProduct();

		tp.addItem(grocery, "Fruits", "Apple", 20.0);
		tp.addItem(grocery, "Dairy", "Milk", 120.0);
		tp.addItem(grocery, "Dairy", "abcd" , 20.0);
		
		System.out.println(grocery);

		
        System.out.println("Enter category:");
        String category = sc.nextLine();

        System.out.println("Enter item name:");
        String item = sc.nextLine();

        System.out.println("Enter price:");
        double price = sc.nextDouble();
        
        System.out.println("Enter remove item name:");
        String rmitem = sc.next();

        tp.addItem(grocery, category, item, price);
        



		
		
		double appleP = tp.getPrice(grocery, "Fruits", "Apple");
        double milkP = tp.getPrice(grocery, "Dairy", "Milk");
        double breadP = tp.getPrice(grocery, "Bakery", "Bread");

        System.out.println("Apple : " + appleP); 
        System.out.println("Milk : " + milkP);   
        System.out.println("Bread : " + breadP); 
    


//		System.out.println(grocery);
        for (Map.Entry<String, Map<String, Double>> entry : grocery.entrySet()) {

			System.out.println("key: " + entry.getKey() + " value:" + entry.getValue());
			;
		}
	
        
        tp.removeItem(grocery, category, rmitem);
		
		
//		System.out.println(grocery);
		
//		System.out.println("Remove");
		
		
	}

	public void addItem(Map<String, Map<String, Double>> grocery, String category, String item, double price) {
		grocery.putIfAbsent(category, new LinkedHashMap<>());
		grocery.get(category).put(item, price);

	}
	
	public double getPrice(Map<String, Map<String, Double>> grocery, String category, String item) {
	    if (grocery.containsKey(category)) {
	        return grocery.get(category).getOrDefault(item, 0.0);
	    }
	    return 0.0;
	}
	
	public void removeItem(Map<String, Map<String, Double>> grocery, String category, String rmitem) {
	    if (grocery.containsKey(category)) {
	        grocery.get(category).remove(rmitem);
	    }
	}}