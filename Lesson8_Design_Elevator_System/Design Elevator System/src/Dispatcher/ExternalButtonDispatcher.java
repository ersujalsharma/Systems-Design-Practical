package Dispatcher;

import Building.Building;
import elevatorComponent.Direction;
import elevatorComponent.ElevatorController;

import java.util.List;

public class ExternalButtonDispatcher extends Dispatcher{

    public ExternalButtonDispatcher(List<ElevatorController> list) {
        super(list);
    }
    public void submitExternalRequest(int floor, Direction direction){
        // find minDistance
        int min = Integer.MAX_VALUE;
        ElevatorController elevatorController1 = null;
        for(ElevatorController elevatorController : list){
            int val = 0;
            if(elevatorController.elevator.direction == Direction.Up){
                if(floor<elevatorController.elevator.currentFloor){
                    val += (Building.list.size()-elevatorController.elevator.currentFloor)+
                            Building.list.size()-floor;
                }
                else{
                    val += elevatorController.elevator.currentFloor-floor;
                }
            }
            else{
                if(floor<elevatorController.elevator.currentFloor){
                    val += elevatorController.elevator.currentFloor-floor;
                }
                else{
                    val += elevatorController.elevator.currentFloor+floor;
                }
            }
            if(val<min){
                min = val;
                elevatorController1 = elevatorController;
            }
        }
        elevatorController1.acceptNewReq(floor,direction);
    }
}
