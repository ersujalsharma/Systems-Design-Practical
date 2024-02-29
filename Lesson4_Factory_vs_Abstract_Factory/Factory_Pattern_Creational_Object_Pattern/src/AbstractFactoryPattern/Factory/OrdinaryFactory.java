package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Objects.*;

public class OrdinaryFactory implements Factory{
    @Override
    public Vehicle getVehicle(String input) {
        return switch (input){
            case "V1" -> new OrdinaryV1();
            case "V2" -> new OrdinaryV2();
            default -> null;
        };
    }
}
