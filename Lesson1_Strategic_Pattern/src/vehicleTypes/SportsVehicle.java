package StrategicPattern.src.vehicleTypes;

import StrategicPattern.src.vehicle.Vehicle;

public class SportsVehicle extends Vehicle {
	public SportsVehicle(StrategicPattern.src.VehicleStrategy.DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	// As We Can See We are reusing the same code for multiple 
	// child classes
	public static void main(String[] args) {
		SportsVehicle s = new SportsVehicle(new StrategicPattern.src.VehicleStrategy.SportsStrategy());
		s.driveStrategy.drive();
	}
}
