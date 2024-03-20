public class VehicleFactory{
    Vehicle vehicle;
    public Vehicle getVehicles(String input){
        return switch (input){
            case "CAR" -> new Car();
            case "BIKE" -> new Bike();
            default -> new Nullable();
        };
    }
}
