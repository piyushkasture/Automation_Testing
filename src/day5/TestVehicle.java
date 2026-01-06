package day5;

public class TestVehicle {
	public static void main(String[] args) {
		Vehicle c1 = new Car();
		
		c1.startEngine();
		c1.stopEngine();
		
		Vehicle.getTopSpeedLimit();
		c1.turn("Car direction North");
		
		Vehicle b1 = new Bicycle();
		
		b1.startEngine();
		b1.stopEngine();
		Vehicle.getTopSpeedLimit();
		b1.turn("Bicycle direction West");
		
		
        Limit r1 = new Rule();
		
		r1.startEngine();
		r1.stopEngine();
		Limit.getTopSpeedLimit();
		r1.turn("Bicycle direction West");
		
	}

}
