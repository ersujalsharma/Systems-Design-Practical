package Button;

import Building.Floor;
import Dispatcher.*;
import elevatorComponent.Direction;
import elevatorComponent.Elevator;

public class InternalButton{
    InternalButtonDispatcher internalButtonDispatcher;
    public void pressButton(int button,Elevator elevator) {
        internalButtonDispatcher.submitInternalReq(button,elevator);
    }
}
