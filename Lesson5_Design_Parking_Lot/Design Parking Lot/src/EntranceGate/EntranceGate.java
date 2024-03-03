package EntranceGate;

import ParkingSpot.ParkingSpot;
import ParkingSpotManager.ParkingSpotManager;
import ParkingSpotManagerFactory.ParkingSpotManagerFactory;
import Ticket.Ticket;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class EntranceGate {
    public ParkingSpot findParkingSpace(Vehicle vehicle,ParkingSpotManager parkingSpotManager){ // it will find Parking Space and Park the vehicle as well as generateTicket;
        ParkingSpot parkingSpot =  parkingSpotManager.findmeParkingSpace();
        return parkingSpot;
    }
    public Ticket bookSpot(Vehicle vehicle,ParkingSpot parkingSpot){
        parkingSpot.parkVehicle(vehicle);
        return generateTicket(vehicle,parkingSpot);
    }
    public Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot){
        Ticket newTicket = new Ticket(LocalDateTime.now(),vehicle,parkingSpot);
        return newTicket;
    }

}
