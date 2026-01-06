package day5;

public interface Vehicle {
	final int sp =90;
	
	public abstract void startEngine();
	public abstract void stopEngine();
	
	public void turn(String direction);
	
	public static int getTopSpeedLimit() {
		System.out.println("Top Speed: "+sp);
		return 0;
	}

}
