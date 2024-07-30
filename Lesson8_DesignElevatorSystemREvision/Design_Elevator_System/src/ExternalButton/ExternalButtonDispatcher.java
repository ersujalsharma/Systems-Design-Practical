package ExternalButton;

import Display.Direction;
import Elevator.ElevatorCar;
import Elevator.ElevatorController;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public List<ElevatorController> getElevatorControllerList() {
        return elevatorControllerList;
    }

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitReq(int liftId, int floorId, Direction direction){
        for(ElevatorController elevatorController : elevatorControllerList){
            if(elevatorController.getElevatorCar().getElevatorId() == liftId){
                elevatorController.acceptNewRequest(floorId,direction);
            }
        }
    }
}
