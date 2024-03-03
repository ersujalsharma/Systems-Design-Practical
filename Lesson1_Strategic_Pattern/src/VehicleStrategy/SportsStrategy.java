package StrategicPattern.VehicleStrategy;

public class SportsStrategy implements DriveStrategy{

	@Override
	public void drive() {
		System.out.println("Sports Drive Strategy");
	}
	
}
