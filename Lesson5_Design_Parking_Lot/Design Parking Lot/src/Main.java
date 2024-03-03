import EntranceGate.EntranceGate;
import ExitGate.ExitGate;
import ParkingSpot.*;
import ParkingSpotManager.ParkingSpotManager;
import ParkingSpotManagerFactory.ParkingSpotManagerFactory;
import Ticket.Ticket;
import Vehicle.Vehicle;
import Vehicle.VehicleTypes;

public class Main {
    public static void main(String[] args) {
        // Parking Spot For Two Wheeler
        ParkingSpot parkingSpot1 = new TwoWheelerParkingSpot(1);
        ParkingSpot parkingSpot2 = new TwoWheelerParkingSpot(2);
        ParkingSpot parkingSpot3 = new TwoWheelerParkingSpot(3);
        ParkingSpot parkingSpot4 = new TwoWheelerParkingSpot(4);
        // Four Wheeler Parking Spot
        ParkingSpot parkingSpot5 = new FourWheelerParkingSpot(10);
        ParkingSpot parkingSpot6 = new FourWheelerParkingSpot(20);
        ParkingSpot parkingSpot7 = new FourWheelerParkingSpot(30);
        ParkingSpot parkingSpot8 = new FourWheelerParkingSpot(40);
        // Parking Spot Manager Factory -> it stores all the object and gives you the object with vehicle types
        ParkingSpotManagerFactory parkingSpotManagerFactory = new ParkingSpotManagerFactory();
        // Parking Spot Manager For Two Wheeler.
        ParkingSpotManager parkingSpotManagerTwoWheeler = parkingSpotManagerFactory.getParkingSpotManager(VehicleTypes.Two_Wheeler);
        parkingSpotManagerTwoWheeler.addParkingSpace(parkingSpot1);
        parkingSpotManagerTwoWheeler.addParkingSpace(parkingSpot2);
        parkingSpotManagerTwoWheeler.addParkingSpace(parkingSpot3);
        parkingSpotManagerTwoWheeler.addParkingSpace(parkingSpot4);
        // Parking Sport Manager For Four Wheeler
        ParkingSpotManager parkingSpotManagerFourWheeler = parkingSpotManagerFactory.getParkingSpotManager(VehicleTypes.Four_Wheeler);
        parkingSpotManagerFourWheeler.addParkingSpace(parkingSpot5);
        parkingSpotManagerFourWheeler.addParkingSpace(parkingSpot6);
        parkingSpotManagerFourWheeler.addParkingSpace(parkingSpot7);
        parkingSpotManagerFourWheeler.addParkingSpace(parkingSpot8);
//        System.out.println(parkingSpotManagerFourWheeler.parkingSpotList);
        //
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicle_Number = 1;
        vehicle1.vehicleTypes = VehicleTypes.Two_Wheeler;

        Vehicle vehicle2 = new Vehicle();
        vehicle2.vehicle_Number = 2;
        vehicle2.vehicleTypes = VehicleTypes.Two_Wheeler;

        Vehicle vehicle3 = new Vehicle();
        vehicle3.vehicle_Number = 3;
        vehicle3.vehicleTypes = VehicleTypes.Four_Wheeler;


        // Entrance Gate
        EntranceGate entranceGate = new EntranceGate();
//        // parking Gate
        ParkingSpot parkingSpotVehicle1 = entranceGate.findParkingSpace(vehicle1,parkingSpotManagerTwoWheeler);
        for (ParkingSpot parkingSpot : parkingSpotManagerTwoWheeler.parkingSpotList) {
            System.out.println(parkingSpot.isEmpty);
        }

        System.out.println(parkingSpotVehicle1);
        Ticket ticketVehicle1 = entranceGate.bookSpot(vehicle1,parkingSpotVehicle1);
        System.out.println(ticketVehicle1.vehicle.vehicle_Number);

        ParkingSpot parkingSpotVehicle2 = entranceGate.findParkingSpace(vehicle2,parkingSpotManagerTwoWheeler);
        Ticket ticketVehicle2 = entranceGate.bookSpot(vehicle2,parkingSpotVehicle2);
        ParkingSpot parkingSpotVehicle3 = entranceGate.findParkingSpace(vehicle3,parkingSpotManagerFourWheeler);
        Ticket ticketVehicle3 = entranceGate.bookSpot(vehicle3,parkingSpotVehicle3);
        System.out.println(ticketVehicle2.vehicle.vehicle_Number);
        System.out.println(ticketVehicle3.vehicle.vehicle_Number);

        ExitGate exitGate = new ExitGate();
        int price1 = exitGate.removeVehicle(vehicle1,ticketVehicle1);
        int price2 = exitGate.removeVehicle(vehicle2,ticketVehicle2);
        int price3 = exitGate.removeVehicle(vehicle3,ticketVehicle3);
        System.out.println(price1+"/"+price2+"/"+price3);
    }
}