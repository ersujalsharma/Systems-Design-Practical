package entryGate;

import parkingSpot.ParkingSpot;
import vehicle.Vehicle;

import java.time.LocalDateTime;

public class Ticket {
    int ticketNumber;
    LocalDateTime entryTime;
    Vehicle vehicle;
    ParkingSpot parkingSpot;

    public Ticket(int ticketNumber,LocalDateTime entryTime,Vehicle vehicle,ParkingSpot parkingSpot){
        this.ticketNumber = ticketNumber;
        this.entryTime = entryTime;
        this.vehicle = vehicle;
        this.parkingSpot = parkingSpot;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public LocalDateTime getEntryTime() {
        return entryTime;
    }

    public void setEntryTime(LocalDateTime entryTime) {
        this.entryTime = entryTime;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }
}
