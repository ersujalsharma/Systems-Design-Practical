package ParkingSpot;

import Vehicle.Vehicle;

public class ParkingSpot {
    public boolean isEmpty = true;
    public Vehicle vehicle;
    public int price;

    public boolean isEmpty() {
        return isEmpty;
    }


    public void parkVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
        isEmpty = false;
    }

    public void removeVehicle() {
        this.vehicle = null;
        isEmpty = true;
    }

}
