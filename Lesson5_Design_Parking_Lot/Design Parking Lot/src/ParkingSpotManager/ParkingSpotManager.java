package ParkingSpotManager;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.util.List;

public class ParkingSpotManager {
    public List<ParkingSpot> parkingSpotList;
    public ParkingSpotManager(List<ParkingSpot> list){
        this.parkingSpotList = list;
    }
    public ParkingSpot findmeParkingSpace(){
        for(ParkingSpot parkingSpot : parkingSpotList){
            if(parkingSpot.isEmpty()) return parkingSpot;
        }
        return null;
    }
    public void addParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.add(parkingSpot);
    }
    public void removeParkingSpace(ParkingSpot parkingSpot){
        parkingSpotList.remove(parkingSpot);
    }
    public ParkingSpot parkVehicle(Vehicle vehicle) {
        ParkingSpot parkingSpot = findmeParkingSpace();
        if(parkingSpot == null) return null;
        parkingSpot.parkVehicle(vehicle);
        return parkingSpot;
    }
    public void removeVehicle(ParkingSpot parkingSpot) {
        parkingSpot.removeVehicle();
    }
}
