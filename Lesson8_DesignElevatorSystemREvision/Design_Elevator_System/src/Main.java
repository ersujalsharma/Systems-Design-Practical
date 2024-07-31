import Display.Direction;
import Elevator.ElevatorCar;
import Elevator.ElevatorController;
import ExternalButton.*;
import Floor.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Floor 1
        Floor floor1 = new Floor();
        floor1.setCurrentFloor(1);
        ExternalButton externalButton1 = new ExternalButton();
        ExternalButtonDispatcher externalButtonDispatcher = new ExternalButtonDispatcher();
        externalButton1.setExternalButtonDispatcher(externalButtonDispatcher);
        floor1.setExternalButton(externalButton1);
        // Floor 2
        Floor floor2 = new Floor();
        floor2.setCurrentFloor(2);
        ExternalButton externalButton2 = new ExternalButton();
        externalButton2.setExternalButtonDispatcher(externalButtonDispatcher);
        // Building
        Building building = new Building();
        List<Floor> floorList = new ArrayList<>();
        floorList.add(floor1);
        floorList.add(floor2);
        building.setFloors(floorList);
        // ElevatorCar 1
        ElevatorCar elevatorCar1 = new ElevatorCar();
        elevatorCar1.setElevatorId(1);
        elevatorCar1.setCurrent_floor(floor1);
        elevatorCar1.setDirection(Direction.Up);
        // ElevatorCar 2
        ElevatorCar elevatorCar2 = new ElevatorCar();
        elevatorCar2.setElevatorId(2);
        elevatorCar2.setCurrent_floor(floor1);
        elevatorCar2.setDirection(Direction.Up);
        // ElevatorController1
        ElevatorController elevatorController1 = new ElevatorController();
        elevatorController1.setElevatorCar(elevatorCar1);
        // ElevatorController2
        ElevatorController elevatorController2 = new ElevatorController();
        elevatorController2.setElevatorCar(elevatorCar2);
        // Elevator Controller List
        List<ElevatorController> elevatorControllerList = new ArrayList<>();
        elevatorControllerList.add(elevatorController1);
        elevatorControllerList.add(elevatorController2);
        externalButtonDispatcher.setElevatorControllerList(elevatorControllerList);


    }
}