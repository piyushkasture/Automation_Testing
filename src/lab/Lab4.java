package lab;

public class Lab4 {
	public static void main(String[] args) {
		int num = 5;
		
		for(int i=num; i>=1;i--) {
			for(int j=1; j<=i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		
		
		for(int i=1; i<=num;i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}

}
