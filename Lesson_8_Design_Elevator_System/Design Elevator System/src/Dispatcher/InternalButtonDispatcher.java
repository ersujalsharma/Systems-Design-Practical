package Dispatcher;

import elevatorComponent.Direction;
import elevatorComponent.Elevator;
import elevatorComponent.ElevatorController;

import java.util.List;

public class InternalButtonDispatcher extends Dispatcher{

    public InternalButtonDispatcher(List<ElevatorController> list) {
        super(list);
    }
    public void submitInternalReq(int floor, Elevator elevator){
        Direction direction;
        if(floor<elevator.currentFloor){
            direction = Direction.Down;
        }
        else{
            direction = Direction.Up;
        }
        for(ElevatorController elevatorController : list){
            if(elevatorController.elevator == elevator){
                elevatorController.acceptNewReq(floor,direction);
                break;
            }
        }
    }
}
