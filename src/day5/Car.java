package day5;

public class Car implements Vehicle{

	@Override
	public void startEngine() {
		System.out.println("Car engine started");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void stopEngine() {
		System.out.println("Car engine stop");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turn(String direction) {
		System.out.println(direction);
		// TODO Auto-generated method stub
		
	}

}
