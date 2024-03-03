package Ticket;

import ParkingSpot.ParkingSpot;
import Vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    public LocalDateTime localDateTime;
    public Vehicle vehicle;
    public ParkingSpot parkingSpot;
    public Ticket(LocalDateTime localDateTime, Vehicle vehicle, ParkingSpot parkingSpot){
        this.localDateTime = localDateTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }
}
