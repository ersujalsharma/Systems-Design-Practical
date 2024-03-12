import Building.Building;
import Building.Floor;
import Button.ExternalButton;
import elevatorComponent.Elevator;
import elevatorComponent.ElevatorController;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Floor> list = new ArrayList<>();
        ExternalButton externalButton1 = new ExternalButton();
        Floor floor1 = new Floor(1,externalButton1);
        ExternalButton externalButton2 = new ExternalButton();
        Floor floor2 = new Floor(2,externalButton2);
        ExternalButton externalButton3 = new ExternalButton();
        Floor floor3 = new Floor(3,externalButton3);
        list.add(floor1);
        list.add(floor2);
        list.add(floor3);
        Building building = new Building(list);
        Elevator elevator = new Elevator();
        elevator.elevatorId = 1;
        ElevatorController elevatorController = new ElevatorController();
        elevatorController.elevator = elevator;
        elevatorController.controlCar();
    }
}