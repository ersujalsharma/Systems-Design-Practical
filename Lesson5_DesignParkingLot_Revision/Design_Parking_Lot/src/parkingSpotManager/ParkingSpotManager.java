package parkingSpotManager;

import parkingSpot.ParkingSpot;
import vehicle.*;

import java.util.List;

public class ParkingSpotManager {
    public List<ParkingSpot> list;
    public ParkingSpotManager(List<ParkingSpot> list){
        this.list = list;
    }

    public boolean findParkingSpace(){
        for(ParkingSpot p : list){
            if(p.isiSEmpty()){
                return true;
            }
        }
        return false;
    }
    public void addParkingSpace(ParkingSpot parkingSpot){
        list.add(parkingSpot);
    }
    public void removeParkingSpace(ParkingSpot parkingSpot){
        list.remove(parkingSpot);
    }
    public ParkingSpot parkVehicle(Vehicle vehicle){
        ParkingSpot parkingSpot = null;
        for(ParkingSpot p : list){
            if(p.isiSEmpty()){
                p.parkVehicle(vehicle);
                return p;
            }
        }
        return null;
    }
}
