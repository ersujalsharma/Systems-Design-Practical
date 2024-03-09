package Button;

import Building.Floor;
import Dispatcher.Dispatcher;
import elevatorComponent.Direction;

public class ExternalButton extends Button{
    public ExternalButton(Dispatcher dispatcher){
        super(dispatcher);
    }
    @Override
    void pressButton(Floor floor, Direction direction) {

    }
}
