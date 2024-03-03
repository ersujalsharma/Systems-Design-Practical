package CostComputation.Factory;

import CostComputation.CostComputation;
import CostComputation.FourWheelerCostComputation;
import CostComputation.TwoWheelerCostComputation;
import Vehicle.VehicleTypes;

public class CostComputationFactory {

    public CostComputation getCostComputation(VehicleTypes vehicleTypes){
        return switch(vehicleTypes){
            case Two_Wheeler -> new TwoWheelerCostComputation();
            case Four_Wheeler -> new FourWheelerCostComputation();
        };
    }
}
