package StrategicPattern.vehicleTypes;

import StrategicPattern.VehicleStrategy.DriveStrategy;
import StrategicPattern.VehicleStrategy.SportsStrategy;
import StrategicPattern.vehicle.Vehicle;

public class SportsVehicle extends Vehicle {
	public SportsVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	// As We Can See We are reusing the same code for multiple 
	// child classes
	public static void main(String[] args) {
		SportsVehicle s = new SportsVehicle(new SportsStrategy());
		s.driveStrategy.drive();
	}
}
