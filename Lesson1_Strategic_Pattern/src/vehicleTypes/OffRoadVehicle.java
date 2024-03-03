package StrategicPattern.vehicleTypes;

import StrategicPattern.VehicleStrategy.DriveStrategy;
import StrategicPattern.VehicleStrategy.SportsStrategy;
import StrategicPattern.vehicle.Vehicle;

public class OffRoadVehicle extends Vehicle {
	public OffRoadVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}	
	public static void main(String[] args) {
		OffRoadVehicle p = new OffRoadVehicle(new SportsStrategy());
		p.driveStrategy.drive();
	}
}
