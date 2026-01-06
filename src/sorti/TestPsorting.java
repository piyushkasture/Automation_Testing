package sorti;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class TestPsorting {
	
	public static void main(String[] args) {
		List<Product> prodcuts= new ArrayList<>();
		prodcuts.add(new Product(5, "boat headphones", 6000));
		prodcuts.add(new Product(1, "laptrop", 62000));

		prodcuts.add(new Product(2, "iphone", 4000));

		prodcuts.add(new Product(3, "ipad", 5100));

		prodcuts.add(new Product(7, "boat earhone", 5600));

		prodcuts.add(new Product(6, "char cable ", 41000));
		prodcuts.add(new Product(4, "mouser cable ", 4400));
		
		for(Product p: prodcuts) {
			
			System.out.println(p);
		}
		
		System.out.println("--------------------------------");
		Collections.sort(prodcuts);

		for(Product p: prodcuts) {
			
			System.out.println(p);
		}
		
		
		prodcuts.stream().forEach(System.out::println);
	
		
	}

}
