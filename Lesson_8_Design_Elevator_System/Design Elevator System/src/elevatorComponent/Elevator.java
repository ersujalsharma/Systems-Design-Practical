package elevatorComponent;

import Building.Floor;
import Button.InternalButton;

public class Elevator {
    public int elevatorId;
    public Display display;
    public Floor currentFloor;
    public Direction direction;
    public Status status;
    public InternalButton internalButton;
    public Door door;
}
