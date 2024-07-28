package factoryClasses;

import parkingSpot.ParkingSpot;
import parkingSpotManager.*;
import vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {
    public ParkingSpotManager parkingSpotManager;
    public ParkingSpotManager getParkingSpotManger(VehicleType vehicleType){
        switch (vehicleType){
            case FOUR_WHEELER -> {
                return new FourWheelerParkingSpotManager(new ArrayList<>());
            }
            case TWO_WHEELER -> {
                return new TwoWheelerParkingSpotManger(new ArrayList<>());
            }
        }
        return null;
    }
}
