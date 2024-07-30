package Elevator;

import Display.Direction;

import java.util.List;

public class InternalButtonDispatcher {
    List<ElevatorController> elevatorCarList;
    public void submitReq(int liftId, int floorId, Direction direction){
        for(ElevatorController  elevatorController : elevatorCarList){
            if(elevatorController.getElevatorCar().getElevatorId() == liftId){
                elevatorController.acceptNewRequest(floorId,direction);
            }
        }
    }
}
