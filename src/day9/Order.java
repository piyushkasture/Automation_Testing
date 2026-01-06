package day9;

import java.util.Objects;

public class Order implements Comparable<Order> {
	
	int orderId;
	String customerName;
	double orderAmount;
	String orderStaus;
	public Order(int orderId, String customerName, double orderAmount, String orderStaus) {
		super();
		this.orderId = orderId;
		this.customerName = customerName;
		this.orderAmount = orderAmount;
		this.orderStaus = orderStaus;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerName=" + customerName + ", orderAmount=" + orderAmount
				+ ", orderStaus=" + orderStaus + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(customerName, orderAmount, orderId, orderStaus);
	}
	public String getOrderStaus() {
		return orderStaus;
	}
	public void setOrderStaus(String orderStaus) {
		this.orderStaus = orderStaus;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return  orderId == other.orderId ;
	}
	public double getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(double orderAmount) {
		this.orderAmount = orderAmount;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	@Override
	public int compareTo(Order o) {
		// TODO Auto-generated method stub
		return Double.compare(this.orderAmount, o.orderAmount);
//		return Double.compare(o.orderAmount,this.orderAmount);
	}
	
	
	

}
