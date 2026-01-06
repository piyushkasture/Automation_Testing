package day9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collector;
import java.util.stream.Collectors;







public class testOrder {
	public static void main(String[] args) {
		List<Order> orders = Arrays.asList(
				
				new Order(101, "Piyush", 1200.00, "delivered"),
                new Order(102, "Tilak", 450.00, "pending"),
                new Order(103, "Manoj", 3000.00, "delivered"),
                new Order(104, "Raj", 150.00, "cancelled"),
                new Order(105, "Chota", 800.00, "delivered"),
                new Order(106, "Riya", 10.00, "pending"),
                new Order(107, "Nisha", 5000.00, "pending"),
                new Order(108, "Risha", 2200.0, "delivered"),
                new Order(109, "Sarla", 99.99, "delivered")
//                new Order(106, "Riya", 10.00, "pending")
                );
        

		
		
		//get all order deleieverd
//		List<Order> deliveredOrders = orders.stream()
//                .filter(o -> o.getOrderStatus().equals("delivered"))
//                
//        System.out.println("Delivered : " + deliveredOrders);
		
//		for (Order o: orders) {
//			
//			if(o.getOrderStaus().equals("delivered"));
//			System.out.println(o);;
//		}
		
//		orders.stream().filter(o -> o.getOrderStaus().equals("delivered")).forEach(o ->System.out.println(o));
		
		
		//only customer names
		
//		for (Order o: orders) {
//			System.out.println(o.customerName);
//
//		}
//		
//		orders.stream().forEach(o ->System.out.println(o.customerName));
		
		//get list of unique name
	
//		Set<String> uniqueNames = new HashSet<>();
//
//		for (Order o : orders) {
//		    if (uniqueNames.add(o.customerName)) {
//		        System.out.println(o.customerName);
//		    }
//		}
		
//		orders.stream().map(o -> o.getCustomerName()).distinct().forEach(System.out::println);
		
		
		//amountt asending
		
		//  ascending using stream
//		orders.stream().sorted() .forEach(o -> System.out.println("Customer: " + o.getCustomerName() + ", Amount: " + o.orderAmount));
//		System.out.println("desecending");
//		orders.stream().sorted(Collections.reverseOrder()).forEach(o -> System.out.println("Customer: " + o.getCustomerName() + ", Amount: " + o.orderAmount));
		
//		// collect amounts into a list
        List<Double> amounts = new ArrayList<>();
//        Collections.sort(amounts);
//        for (Order o : orders) {
//            amounts.add(o.orderAmount);
//            System.out.println(o.orderAmount);
//     
//        }
        

        Collections.sort(orders);
        for (Order o : orders) {
//            amounts.add(o.orderAmount);
//            System.out.println(o);
     
        }
//        for (Double amt : amounts) {
//            System.out.println("Name: "+ amt);
//        }

//        int i = 0;
//        for (Order dd : orders) {
//        	if(i==2 ) {
//        		System.out.println(dd);
//        	}
//			
//		}
//        for(int i = 0; i<3; i++)
			
			
//		orders.stream().sorted().forEach(o -> System.out.println("Customer: " + o.getCustomerName() + ", Amount: " + o.orderAmount));
        System.out.println("asending");
        orders.stream().sorted(Comparator.comparingDouble(Order::getOrderAmount)).forEach(System.out::println);
        System.out.println("decendings");
        orders.stream().sorted(Comparator.comparingDouble(Order::getOrderAmount).reversed()).forEach(System.out::println);
        System.out.println("lmit 3");
        orders.stream().sorted(Comparator.comparingDouble(Order::getOrderAmount).reversed()).limit(3).forEach(System.out::println);
        
        System.out.println("skip");
        orders.stream().skip(2).forEach(System.out::println);
        
        System.out.println("dleiverd");
		orders.stream().filter(o -> "delivered".equals(o.getOrderStaus())).count();
		System.out.println(orders.stream().filter(o -> "delivered".equals(o.getOrderStaus())).count());
		System.out.println(orders.stream().filter(o -> o.getOrderStaus().equals("delivered")).count());
		
        System.out.println("lIST");

		List<Order> deliverdlist = orders.stream().filter(o -> "delivered".equals(o.getOrderStaus())).collect(Collectors.toList());
		
		deliverdlist.stream().forEach(System.out::println);
		
		System.out.println("CANCELLED");
//		System.out.println(orders.stream().filter(o -> o.getOrderStaus().equals("cancelled")).count());
//		
//        List<Order> Clist = orders.stream().filter(o -> "cancelled".equals(o.getOrderStaus())).collect(Collectors.toList());
//		
//		Clist.stream().forEach(System.out::println);
		boolean hascancelled = orders.stream().anyMatch(o -> o.getOrderStaus().equals("cancelled"));
		if(!hascancelled) {
			System.out.println("no cancelled");
		}else {
			System.out.println("some cenceleld");
		}
		
		
		System.out.println("all above gereter 500");
		System.out.println(orders.stream().allMatch(o -> o.getOrderAmount() > 500));
		boolean above500 = orders.stream().anyMatch(o -> o.getOrderAmount() > 500);
		if(!above500) {
			System.out.println("all above 500");
		}else {
			System.out.println("not all orders above 500");
		}
		
		System.out.println("First Delivered");
		Order firstDelivered = orders.stream().filter(o -> o.getOrderStatus().equals("delivered")).findFirst()
                .orElse(null);
        System.out.println("First Delivered: " + firstDelivered);
        
        
		
		System.out.println("total deleiverd revenue");
//		double sum = 0;
//		for (Order o : deliverdlist) {
//		    sum += o.getOrderAmount();
//		}
//		System.out.println(sum);
//		
//		double sum1 = deliverdlist.stream().collect(Collectors.summingDouble(Order::getOrderAmount));
//        System.out.println(sum1);
//        
//        double total = deliverdlist.stream().mapToDouble(Order::getOrderAmount).sum();
//        System.out.println("Total : " + total);
        
        double totalrev = orders.stream().filter(o -> o.getOrderStaus().equals("delivered")).mapToDouble(Order::getOrderAmount).sum();
        System.out.println(totalrev);
        
		
        System.out.println("highest/lowest");
        double highest = orders.stream().mapToDouble(Order::getOrderAmount).max().orElse(0);
        System.out.println(highest);
        double lowest = orders.stream().mapToDouble(Order::getOrderAmount).min().orElse(0);
        System.out.println(lowest);
        
        
        System.out.println("orderId, customer, and amount");
        orders.forEach(o -> System.out.println("OrderID: " + o.getOrderId() +", Customer: " + o.getCustomerName() +", Amount: " + o.getOrderAmount()));
   
	}

}
