package AbstractFactoryPattern.AbstractFactory;

import AbstractFactoryPattern.Factory.Factory;
import AbstractFactoryPattern.Factory.LuxuryFactory;
import AbstractFactoryPattern.Factory.OrdinaryFactory;

public class VehicleGroupFactory {
    public Factory getVehicleGroup(String input){
        return switch (input){
            case "LUXURY" -> new LuxuryFactory();
            case "ORDINARY" -> new OrdinaryFactory();
            default -> null;
        };
    }
}
