import java.util.List;

public class VehicleInventoryManagement {
    List<Vehicle> vehicles;
    VehicleInventoryManagement(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }
    public List<Vehicle> getVehicles(){
        return vehicles;
    }
    public void setVehicles(List<Vehicle> vehicles){
        this.vehicles = vehicles;
    }
    public void addVehicles(Vehicle vehicle){
        vehicles.add(vehicle);
    }
    public void removeVehicles(Vehicle vehicle){
        vehicles.remove(vehicle);
    }
}
