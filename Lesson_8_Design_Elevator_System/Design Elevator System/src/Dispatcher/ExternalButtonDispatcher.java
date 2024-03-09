package Dispatcher;

import elevatorComponent.ElevatorController;

import java.util.List;

public class ExternalButtonDispatcher extends Dispatcher{

    public ExternalButtonDispatcher(List<ElevatorController> list) {
        super(list);
    }
}
