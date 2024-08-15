import Adapter.WeightMachineKG;
import Adaptie.WeighingMachine;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        WeighingMachine weighingMachine = new WeighingMachine();
        int val = weighingMachine.getWeightInPounds();
        System.out.println(val);
        WeightMachineKG weightMachineKG = new WeightMachineKG(weighingMachine);
        System.out.println(weightMachineKG.getWeight());
    }
}