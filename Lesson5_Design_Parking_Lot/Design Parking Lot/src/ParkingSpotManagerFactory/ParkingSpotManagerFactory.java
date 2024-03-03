package ParkingSpotManagerFactory;

import ParkingSpot.ParkingSpot;
import ParkingSpotManager.*;
import Vehicle.VehicleTypes;

import java.util.ArrayList;
import java.util.List;

public class ParkingSpotManagerFactory {
    ParkingSpotManager parkingSpotManager;
    VehicleTypes vehicleTypes;
    public ParkingSpotManager getParkingSpotManager(VehicleTypes vehicleTypes){
        return switch(vehicleTypes){
            case Two_Wheeler -> new TwoWheelerParkingSpotManager(new ArrayList<>());
            case Four_Wheeler -> new FourWheelerParkingSpotManager(new ArrayList<>());
        };
    }
}
