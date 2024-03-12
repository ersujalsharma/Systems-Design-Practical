package elevatorComponent;

import Building.Floor;

public class Display {
    public Floor floor;
    public Direction direction;
    public void showDisplay(){
        System.out.println(floor.id  + " " + direction);
    }

}
