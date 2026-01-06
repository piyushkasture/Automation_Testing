package list;

import java.util.ArrayList;

public class ArrayList1 {
	
	
	public static void main(String[] args) {
		int a=10;
		Integer b=a;
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(1, 6);
		list.remove(4);//index
		list.remove(0);//object
		
		for(Integer i : list) {
			System.out.println(i);
		}
		
		System.out.println(a);
		System.out.println(b);
	}

}
