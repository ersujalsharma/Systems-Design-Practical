package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Objects.Vehicle;

public interface Factory {
    public Vehicle getVehicle(String input);
}
