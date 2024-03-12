package elevatorComponent;

import Building.Floor;
import Button.InternalButton;

public class Elevator {
    public int elevatorId;
    public Display display;
    public int currentFloor;
    public Direction direction;
    public Status status;
    public InternalButton internalButton;
    public Door door;
    public Elevator(){
        display = new Display();
        internalButton = new InternalButton();
        status = Status.Idle;
        currentFloor = 0;
        direction = Direction.Up;
        door = new Door();
    }
    public void showDisplay(){
        display.showDisplay();
    }
    public void pressButton(int destination){
        internalButton.pressButton(destination,this);
    }
}
