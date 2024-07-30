package Elevator;

import Display.*;
import Floor.Floor;

public class ElevatorCar {
    int elevatorId;
    Display display;
    Floor current_floor;
    Direction direction;
    Status status;
    InternalButton internalButton;
    Door door;

    public int getElevatorId() {
        return elevatorId;
    }

    public void setElevatorId(int elevatorId) {
        this.elevatorId = elevatorId;
    }

    public Display getDisplay() {
        return display;
    }

    public void setDisplay(Display display) {
        this.display = display;
    }

    public Floor getCurrent_floor() {
        return current_floor;
    }

    public void setCurrent_floor(Floor current_floor) {
        this.current_floor = current_floor;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public InternalButton getInternalButton() {
        return internalButton;
    }

    public void setInternalButton(InternalButton internalButton) {
        this.internalButton = internalButton;
    }

    public Door getDoor() {
        return door;
    }

    public void setDoor(Door door) {
        this.door = door;
    }
}
