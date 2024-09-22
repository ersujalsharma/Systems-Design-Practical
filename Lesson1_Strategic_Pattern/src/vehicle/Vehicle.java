package StrategicPattern.src.vehicle;

import StrategicPattern.src.VehicleStrategy.DriveStrategy;

public class Vehicle {
	// it has a strategy,
	public DriveStrategy driveStrategy;
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
}
