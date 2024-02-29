package AbstractFactoryPattern.Factory;

import AbstractFactoryPattern.Objects.LuxuryV1;
import AbstractFactoryPattern.Objects.LuxuryV2;
import AbstractFactoryPattern.Objects.Vehicle;

public class LuxuryFactory implements Factory{
    @Override
    public Vehicle getVehicle(String input) {
        return switch (input){
            case "V1" -> new LuxuryV1();
            case "V2" -> new LuxuryV2();
            default -> null;
        };
    }
}
