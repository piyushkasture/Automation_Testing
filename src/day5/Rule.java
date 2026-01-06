package day5;

public class Rule implements Limit, Vehicle {

	@Override
	public void startEngine() {
		// TODO Auto-generated method stub
		System.out.println("cold start");
		
	}

	@Override
	public void stopEngine() {
		// TODO Auto-generated method stub
		System.out.println("cold stop");
		
	}

	@Override
	public void turn(String direction) {
		System.out.println("Direction :"+ direction);
		
	}

	
		
	

}
