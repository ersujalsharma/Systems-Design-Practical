package Button;

import Building.Floor;
import Dispatcher.*;
import elevatorComponent.Direction;

public class ExternalButton {
    ExternalButtonDispatcher externalButtonDispatcher;
    void pressButton(Floor floor, Direction direction) {
        externalButtonDispatcher.submitExternalRequest(floor.id,direction);
    }
}
