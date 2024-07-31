package ExternalButton;

import Display.Direction;
import Elevator.ElevatorController;
import Floor.Building;

import java.util.List;

public class ExternalButtonDispatcher {
    List<ElevatorController> elevatorControllerList;

    public List<ElevatorController> getElevatorControllerList() {
        return elevatorControllerList;
    }

    public void setElevatorControllerList(List<ElevatorController> elevatorControllerList) {
        this.elevatorControllerList = elevatorControllerList;
    }

    public void submitReq(int floorId, Direction direction) {
        ElevatorController nearest = getNearestElevator(elevatorControllerList,floorId,direction);
        nearest.acceptNewRequest(floorId, direction);
    }

    private ElevatorController getNearestElevator(List<ElevatorController> elevatorControllerList,int currentFloor,Direction direction) {
        int min = Integer.MAX_VALUE;
        ElevatorController nearest = null;
        for(ElevatorController elevatorController : elevatorControllerList){
            int distance = findDistanceFromCurrentFloor(elevatorController,currentFloor,direction);
            if(distance<min){
                min = distance;
                nearest = elevatorController;
            }
        }
        return nearest;
    }

    private int findDistanceFromCurrentFloor(ElevatorController elevatorController, int currentFloor, Direction direction) {
        int distance = 0;
        if(elevatorController.getElevatorCar().getDirection() == direction){
            if(elevatorController.getElevatorCar().getDirection() == Direction.Up){
                if(currentFloor>=elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()){
                    distance = currentFloor -elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor();
                }
                else{
                    distance = Building.getSize()-elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()
                            + Building.getSize()+currentFloor;
                }
            }
            else{
                if(currentFloor<=elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()){
                    distance = elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()-currentFloor;
                }
            }
        }
        else{
            if(elevatorController.getElevatorCar().getDirection() == Direction.Up){
                distance = Building.getSize()-elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()+
                        Building.getSize()-currentFloor;
            }
            else{
                distance = elevatorController.getElevatorCar().getCurrent_floor().getCurrentFloor()+currentFloor;
            }
        }
        return distance;
    }

}
