package exitGate;

import entryGate.Ticket;
import parkingSpotManager.ParkingSpotManager;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ExitGate {
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    public ExitGate(ParkingSpotManager parkingSpotManager){
        this.parkingSpotManager = parkingSpotManager;
    }
    public void removeVehicle(Ticket ticket){
        this.ticket = ticket;
        parkingSpotManager.removeParkingSpace(ticket.getParkingSpot());
        priceCalculation();
    }
    public long priceCalculation(){
        return ChronoUnit.MINUTES.between(LocalDateTime.now().minusMinutes(45),ticket.getEntryTime());
    }
}
