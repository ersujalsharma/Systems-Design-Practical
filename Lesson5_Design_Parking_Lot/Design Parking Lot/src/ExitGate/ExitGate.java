package ExitGate;

import CostComputation.CostComputation;
import CostComputation.Factory.CostComputationFactory;
import ParkingSpotManager.ParkingSpotManager;
import ParkingSpotManagerFactory.ParkingSpotManagerFactory;
import Ticket.Ticket;
import Vehicle.Vehicle;

public class ExitGate{
    Ticket ticket;
    ParkingSpotManager parkingSpotManager;
    ParkingSpotManagerFactory parkingSpotManagerFactory;
    CostComputation costComputation;
    CostComputationFactory costComputationFactory;
    public int removeVehicle(Vehicle vehicle,Ticket ticket){
        costComputationFactory = new CostComputationFactory();
        this.costComputation = costComputationFactory.getCostComputation(vehicle.vehicleTypes);
        this.ticket = ticket;
        int val = priceCalculation();
        return val;
    }
    public int priceCalculation(){
        String val = madePayment();
        System.out.println(val);
        return costComputation.price(ticket);
    }
    public String madePayment(){
        return "It Has To Implement";
    }
}
