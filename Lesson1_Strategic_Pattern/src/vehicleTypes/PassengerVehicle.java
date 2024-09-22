package StrategicPattern.src.vehicleTypes;

import StrategicPattern.src.vehicle.Vehicle;

public class PassengerVehicle extends Vehicle {
	public PassengerVehicle(StrategicPattern.src.VehicleStrategy.DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	public static void main(String[] args) {
		PassengerVehicle p = new PassengerVehicle(new StrategicPattern.src.VehicleStrategy.NormalStrategy());
		p.driveStrategy.drive();
	}
}
