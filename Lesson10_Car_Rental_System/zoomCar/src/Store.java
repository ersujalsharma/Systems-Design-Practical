import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location location;
    List<Reservation> reservations = new ArrayList<>();
    public List<Vehicle> getVehicle(VehicleType vehicleType){
        return inventoryManagement.vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles){
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }
    public Reservation createReservation(Vehicle vehicle,User user){
        Reservation reservation = new Reservation();
        reservation.createReserve(user,vehicle);
        reservations.add(reservation);
        return reservation;
    }
    public boolean completeReservation(int reserveId) {
        return true;
    }
}
