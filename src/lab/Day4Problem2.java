package lab;

public class Day4Problem2 {
	public static void main(String[] args) {
		
		try {
			int arr[]= new int[3];
			
			arr[0]=1;
			arr[1] =2;
			arr[2]=3;
			arr[4]=5;
			
			for(int i:arr) {
				System.out.println(i);
			}
		} catch (Exception e) {
			System.out.println("Array limit exceed..");
		}
		
	}

	

}
