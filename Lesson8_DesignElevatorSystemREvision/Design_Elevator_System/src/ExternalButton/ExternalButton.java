package ExternalButton;

import Display.Direction;
import Elevator.ElevatorController;

public class ExternalButton {

    ExternalButtonDispatcher externalButtonDispatcher;

    public ExternalButtonDispatcher getExternalButtonDispatcher() {
        return externalButtonDispatcher;
    }

    public void setExternalButtonDispatcher(ExternalButtonDispatcher externalButtonDispatcher) {
        this.externalButtonDispatcher = externalButtonDispatcher;
    }

    public void pressButton(int floorId, Direction direction){
        externalButtonDispatcher.submitReq(floorId,direction);
    }
}
