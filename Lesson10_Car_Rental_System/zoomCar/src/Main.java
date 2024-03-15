import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);
        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores,users);
        User user = users.get(0);
        Location location = new Location(411057, "Pune", "Maharastra","India");
        Store store = rentalSystem.getStore(location);
        List<Vehicle> storeVehicles = store.getVehicle(VehicleType.CAR);
        Reservation reservation = store.createReservation(storeVehicles.get(0),users.get(0));
        Bill bill = new Bill(reservation);
        Payment payment = new Payment();
        payment.payBill(bill);
        store.completeReservation(reservation.reservationId);
    }

    private static List<Store> addStores(List<Vehicle> vehicles) {
        List<Store> list = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId = 1;
        store1.setVehicles(vehicles);
        list.add(store1);
        return list;
    }

    private static List<Vehicle> addVehicles() {
        List<Vehicle> list = new ArrayList<>();
        Vehicle vehicle1 = new Vehicle();
        vehicle1.vehicleId = 1;
        vehicle1.vehicleType = VehicleType.CAR;
        list.add(vehicle1);
        return list;
    }

    private static List<User> addUsers() {
        List<User> users = new ArrayList<>();
        User user1 = new User();
        user1.userId = 1;
        users.add(user1);
        return users;
    }
}