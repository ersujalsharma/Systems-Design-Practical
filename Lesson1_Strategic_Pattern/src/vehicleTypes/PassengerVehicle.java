package StrategicPattern.vehicleTypes;

import StrategicPattern.VehicleStrategy.DriveStrategy;
import StrategicPattern.VehicleStrategy.NormalStrategy;
import StrategicPattern.vehicle.Vehicle;

public class PassengerVehicle extends Vehicle{
	public PassengerVehicle(DriveStrategy driveStrategy) {
		super(driveStrategy);
	}
	public static void main(String[] args) {
		PassengerVehicle p = new PassengerVehicle(new NormalStrategy());
		p.driveStrategy.drive();
	}
}
