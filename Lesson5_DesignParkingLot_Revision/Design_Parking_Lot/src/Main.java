import entryGate.*;
import exitGate.ExitGate;
import factoryClasses.ParkingSpotManagerFactory;
import parkingSpot.ParkingSpot;
import parkingSpot.TwoWheelerParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import vehicle.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        ParkingSpot twoWheeler = new TwoWheelerParkingSpot();
        List<ParkingSpot> list = new ArrayList<>();
        list.add(twoWheeler);
        twoWheeler.isEmpty = true;
        ParkingSpotManager parkingSpotManager = new ParkingSpotManager(list);
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        EntryGate entryGate = new EntryGate(parkingSpotManager);
        Vehicle vehicle = new Vehicle();
        vehicle.setVehicleNumber(1);
        vehicle.setVehicleType(VehicleType.TWO_WHEELER);

        for(ParkingSpot l : entryGate.parkingSpotManager.list){
            System.out.println(l.isEmpty);
        }

        boolean space = entryGate.findParkingSpace();
        if(!space){
            System.out.println("Not Space");
            return;
        }
        Ticket ticket = entryGate.bookSpot(vehicle);
        ExitGate exitGate = new ExitGate(parkingSpotManager);
        exitGate.removeVehicle(ticket);
        System.out.println( exitGate.priceCalculation());
    }
}