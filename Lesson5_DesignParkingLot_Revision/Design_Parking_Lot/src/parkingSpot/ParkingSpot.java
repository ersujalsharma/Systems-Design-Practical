package parkingSpot;

import vehicle.Vehicle;

public class ParkingSpot {
    public int id;
    public boolean isEmpty;
    public Vehicle vehicle;
    public boolean isiSEmpty(){
        return isEmpty;
    }
    public void parkVehicle(Vehicle vehicle){
        isEmpty = false;
        this.vehicle = vehicle;
    }
    public void removeVehicle(){
        isEmpty = true;
        this.vehicle = null;
    }
}
