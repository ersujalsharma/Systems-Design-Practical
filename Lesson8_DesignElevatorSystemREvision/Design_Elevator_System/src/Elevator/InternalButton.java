package Elevator;

import Display.Direction;

import java.util.List;

public class InternalButton {

    ElevatorCar elevatorCar;
    InternalButtonDispatcher internalButtonDispatcher;

    public InternalButton(ElevatorCar elevatorCar){
        this.elevatorCar = elevatorCar;
    }

    public InternalButtonDispatcher getInternalButtonDispatcher() {
        return internalButtonDispatcher;
    }

    public void setInternalButtonDispatcher(InternalButtonDispatcher internalButtonDispatcher) {
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(int floorId, Direction direction){
        internalButtonDispatcher.submitReq(elevatorCar.getElevatorId(),floorId,direction);
    }
}
