package Elevator;

import Display.Direction;

import java.util.List;

public class InternalButton {
    InternalButtonDispatcher internalButtonDispatcher;

    public InternalButtonDispatcher getInternalButtonDispatcher() {
        return internalButtonDispatcher;
    }

    public void setInternalButtonDispatcher(InternalButtonDispatcher internalButtonDispatcher) {
        this.internalButtonDispatcher = internalButtonDispatcher;
    }

    public void pressButton(int floorId, Direction direction){
        
    }
}
