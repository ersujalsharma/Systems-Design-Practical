package machine;

import states.IdleState;
import states.State;

import java.util.ArrayList;
import java.util.List;

public class VendingMachine {
    State state;
    VendingMachineInventorySystem vendingMachineInventorySystem;
    List<Coin> coins;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public VendingMachineInventorySystem getVendingMachineInventorySystem() {
        return vendingMachineInventorySystem;
    }

    public void setVendingMachineInventorySystem(VendingMachineInventorySystem vendingMachineInventorySystem) {
        this.vendingMachineInventorySystem = vendingMachineInventorySystem;
    }

    public List<Coin> getCoins() {
        return coins;
    }

    public void setCoins(List<Coin> coins) {
        this.coins = coins;
    }

    public VendingMachine() {
        state = new IdleState();
        vendingMachineInventorySystem = new VendingMachineInventorySystem(10);
        coins = new ArrayList<>();
    }

    public VendingMachine(State state, VendingMachineInventorySystem vendingMachineInventorySystem){
        this.state = state;
        this.vendingMachineInventorySystem = vendingMachineInventorySystem;
        coins = new ArrayList<>();
    }
}
