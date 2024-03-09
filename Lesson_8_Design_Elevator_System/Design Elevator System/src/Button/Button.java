package Button;

import Building.Floor;
import Dispatcher.Dispatcher;
import elevatorComponent.Direction;

public abstract class Button {
    Dispatcher dispatcher;
    abstract void pressButton(Floor floor, Direction direction);
    public Button(Dispatcher dispatcher){
        this.dispatcher = dispatcher;
    }
}
