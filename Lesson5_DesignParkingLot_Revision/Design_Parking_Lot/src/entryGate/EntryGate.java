package entryGate;

import factoryClasses.ParkingSpotManagerFactory;
import parkingSpot.ParkingSpot;
import parkingSpotManager.ParkingSpotManager;
import vehicle.Vehicle;

import java.time.LocalDateTime;

public class EntryGate {
    static int ticketcounter = 0;
    public ParkingSpotManagerFactory parkingSpotManagerFactory;
    public ParkingSpotManager parkingSpotManager;
    public Vehicle vehicle;
    public EntryGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        this.parkingSpotManager = parkingSpotManager;
    }
    public boolean  findParkingSpace(){
        return parkingSpotManager.findParkingSpace();
    }
    public Ticket bookSpot(Vehicle vehicle){
        if(findParkingSpace()){
            ParkingSpot parkingSpot = parkingSpotManager.parkVehicle(vehicle);
            Ticket ticket = generateTicket(vehicle,parkingSpot);
            return ticket;
        }
        return null;
    }

    private Ticket generateTicket(Vehicle vehicle, ParkingSpot parkingSpot) {
        Ticket ticket = new Ticket(ticketcounter, LocalDateTime.now(),vehicle,parkingSpot);
        ticketcounter++;
        return ticket;
    }
}
