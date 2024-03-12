package Building;

import Button.ExternalButton;

public class Floor {
    public int id;
    public ExternalButton externalButton;
    public Floor(int id,ExternalButton externalButton){
        this.id = id;
        this.externalButton = externalButton;
    }
}
