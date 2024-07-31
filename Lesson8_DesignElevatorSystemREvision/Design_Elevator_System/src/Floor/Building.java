package Floor;

import java.util.List;

public class Building {
    private static List<Floor> floors;

    public static List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }
    public static int getSize(){
        return floors.size();
    }
}
