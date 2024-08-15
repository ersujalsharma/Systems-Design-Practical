package Adapter;

import Adaptie.WeighingMachine;

public class WeightMachineKG implements WeightMachineConverter{
    WeighingMachine weighingMachine;
    public WeightMachineKG(WeighingMachine weighingMachine){
        this.weighingMachine = weighingMachine;
    }
    @Override
    public double getWeight() {
        return weighingMachine.getWeightInPounds()*.45;
    }
}
