package Button;

import Building.Floor;
import Dispatcher.Dispatcher;
import elevatorComponent.Direction;

public class InternalButton extends Button{
    public InternalButton(Dispatcher dispatcher){
        super(dispatcher);
    }
    @Override
    void pressButton(Floor floor, Direction direction) {

    }
}
