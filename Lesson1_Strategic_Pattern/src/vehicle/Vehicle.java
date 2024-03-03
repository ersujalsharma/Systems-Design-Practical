package StrategicPattern.vehicle;

import StrategicPattern.VehicleStrategy.DriveStrategy;

public class Vehicle {
	// it has a strategy,
	public DriveStrategy driveStrategy;
	public Vehicle(DriveStrategy driveStrategy) {
		this.driveStrategy = driveStrategy;
	}
}
