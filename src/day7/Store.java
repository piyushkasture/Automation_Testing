package day7;

import java.util.ArrayList;
import java.util.List;

public class Store {
	
	String storeName;
	int  storeID;
	String location;
	String contactNo;
	List<String> inverntory;
	static int counter;
	
	
	static {
		counter=0;
	}
	
	public Store(String storeName, int storeID, String location, String contactNo, List<String> inverntory) {
		super();
		this.storeName = storeName;
		this.storeID = ++counter;
		this.location = location;
		this.contactNo = contactNo;
		this.inverntory = inverntory;
	}
	
	public Store(String storeName, int storeID, String location, String contactNo) {
		super();
		this.storeName = storeName;
		this.storeID = ++counter;
		this.location = location;
		this.contactNo = contactNo;
		this.inverntory =new ArrayList<>();
	}
	
	

	public String getLocation() {
		return location;
	}
	
	

	public int getStoreID() {
		return storeID;
	}


	@Override
	public String toString() {
		return "Store [storeName=" + storeName + ", storeID=" + storeID + ", location=" + location + ", contactNo="
				+ contactNo + ", inverntory=" + inverntory + "]";
	}
	
	
	

}
