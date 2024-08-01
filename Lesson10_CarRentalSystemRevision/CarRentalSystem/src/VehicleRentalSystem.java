import java.util.List;

public class VehicleRentalSystem {
    List<Store> storeList;
    List<User> userList;
    public Store getStore(Location location){
        return storeList.get(0);
    }
    public VehicleRentalSystem(List<Store> storeList,List<User> userList){
        this.storeList = storeList;
        this.userList = userList;
    }
}
