public class Main {
    public static void main(String[] args) {
        VehicleFactory vehicleFactory = new VehicleFactory();
        Vehicle vehicle = vehicleFactory.getVehicles("BIKE");
        int val = vehicle.noOfWheels();
        System.out.println(val);
        Vehicle vehicle2 = vehicleFactory.getVehicles("Tractor");
        int val2 = vehicle2.noOfWheels();
        System.out.println(val2);
    }
}