package StrategicPattern.src.vehicleTypes;

import StrategicPattern.src.vehicle.Vehicle;

public class OffRoadVehicle extends Vehicle {
	public OffRoadVehicle(StrategicPattern.src.VehicleStrategy.DriveStrategy driveStrategy) {
		super(driveStrategy);
	}	
	public static void main(String[] args) {
		OffRoadVehicle p = new OffRoadVehicle(new StrategicPattern.src.VehicleStrategy.SportsStrategy());
		p.driveStrategy.drive();
	}
}
