package Dispatcher;

import elevatorComponent.Elevator;
import elevatorComponent.ElevatorController;

import java.util.List;

public class Dispatcher {
    public List<ElevatorController> list;
    public Dispatcher(List<ElevatorController> list){
        this.list = list;
    }

}
