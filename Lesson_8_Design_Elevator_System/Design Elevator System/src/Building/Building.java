package Building;

import java.util.List;

public class Building {
    public static List<Floor> list;
    public Building(List<Floor> list){
        this.list = list;
    }
    public void addFloors(Floor newFloor){
        list.add(newFloor);
    }
    public void removeFloors(Floor removeFloor){
        list.remove(removeFloor);
    }
    List<Floor> getList(){
        return list;
    }
}
