package day5;

public class temp {

}


package day9;

import java.util.*;
import java.util.stream.Collectors;

public class Order {
    private int orderId;
    private String customerName;
    private double orderAmount;
    private String orderStatus; 

    public Order(int orderId, String customerName, double orderAmount, String orderStatus) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.orderAmount = orderAmount;
        this.orderStatus = orderStatus;
    }

    public int getOrderId() { return orderId; }
    public String getCustomerName() { return customerName; }
    public double getOrderAmount() { return orderAmount; }
    public String getOrderStatus() { return orderStatus; }

    public void setCustomerName(String customerName) { this.customerName = customerName; }
    public void setOrderAmount(double orderAmount) { this.orderAmount = orderAmount; }
    public void setOrderStatus(String orderStatus) { this.orderStatus = orderStatus; }

    @Override
    public String toString() {
        return "Order [orderId=" + orderId +
               ", customerName=" + customerName +
               ", orderAmount=" + orderAmount +
               ", orderStatus=" + orderStatus + "]";
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Order)) return false;
        Order other = (Order) obj;
        return orderId == other.orderId;
    }
}

// ---------------- DRIVER CLASS ----------------

class OrderManager {
    public static void main(String[] args) {
        List<Order> orders = Arrays.asList(
                new Order(101, "Alice", 750, "delivered"),
                new Order(102, "Bob", 300, "pending"),
                new Order(103, "Charlie", 1200, "delivered"),
                new Order(104, "David", 500, "cancelled"),
                new Order(105, "Eve", 950, "delivered")
        );

        // 1. Get all delivered orders
        List<Order> deliveredOrders = orders.stream()
                .filter(o -> o.getOrderStatus().equals("delivered"))
                .collect(Collectors.toList());
        System.out.println("Delivered Orders: " + deliveredOrders);

        // 2. Extract only customer names
        List<String> customerNames = orders.stream()
                .map(Order::getCustomerName)
                .collect(Collectors.toList());
        System.out.println("Customer Names: " + customerNames);

        // 3. Unique customers (using distinct)
        List<String> uniqueCustomers = orders.stream()
                .map(Order::getCustomerName)
                .distinct()
                .collect(Collectors.toList());
        System.out.println("Unique Customers: " + uniqueCustomers);

        // 4. Sort ascending
        List<Order> sortedAsc = orders.stream()
                .sorted(Comparator.comparingDouble(Order::getOrderAmount))
                .collect(Collectors.toList());
        System.out.println("Sorted Ascending: " + sortedAsc);

        // 5. Sort descending
        List<Order> sortedDesc = orders.stream()
                .sorted(Comparator.comparingDouble(Order::getOrderAmount).reversed())
                .collect(Collectors.toList());
        System.out.println("Sorted Descending: " + sortedDesc);

        // 6. Top 3 highest value orders
        List<Order> top3Orders = sortedDesc.stream().limit(3).collect(Collectors.toList());
        System.out.println("Top 3 Orders: " + top3Orders);

        // 7. Skip first 2 orders
        List<Order> skippedOrders = orders.stream().skip(2).collect(Collectors.toList());
        System.out.println("Skipped First 2: " + skippedOrders);

        // 8. Count delivered
        long countDelivered = orders.stream()
                .filter(o -> o.getOrderStatus().equals("delivered"))
                .count();
        System.out.println("Count Delivered: " + countDelivered);

        // 9. Any cancelled?
        boolean anyCancelled = orders.stream().anyMatch(o -> o.getOrderStatus().equals("cancelled"));
        System.out.println("Any Cancelled? " + anyCancelled);

        // 10. All > 580?
        boolean allAbove580 = orders.stream().allMatch(o -> o.getOrderAmount() > 580);
        System.out.println("All > 580? " + allAbove580);

        // 11. First delivered
        Order firstDelivered = orders.stream()
                .filter(o -> o.getOrderStatus().equals("delivered"))
                .findFirst()
                .orElse(null);
        System.out.println("First Delivered: " + firstDelivered);

        // 12. Total revenue of delivered
        double totalRevenue = deliveredOrders.stream()
                .mapToDouble(Order::getOrderAmount)
                .sum();
        System.out.println("Total Revenue (Delivered): " + totalRevenue);

        // 13. Highest & lowest
        double highest = orders.stream().mapToDouble(Order::getOrderAmount).max().orElse(0);
        double lowest = orders.stream().mapToDouble(Order::getOrderAmount).min().orElse(0);
        System.out.println("Highest Amount: " + highest);
        System.out.println("Lowest Amount: " + lowest);

        // 14. Print only orderId, customer, and amount
        System.out.println("Order Summary:");
        orders.forEach(o -> System.out.println("OrderID: " + o.getOrderId() +
                ", Customer: " + o.getCustomerName() +
                ", Amount: " + o.getOrderAmount()));
    }
}