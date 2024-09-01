package DesignATM.USERHOLDER;

import DesignATM.ATMStates.ATMState;
import DesignATM.ATMStates.IdleState;

public class ATM {
    private static ATM atmObject = new ATM();
    // eager initialization
    ATMState currentATMState;
    private int atmBalance;
    int noOfTwoThousandNotes;
    int noOfFiveHundredNotes;
    int noOfOneHundredNotes;
    private ATM(){

    }

    public void setCurrentATMState(ATMState currentATMState){
        this.currentATMState = currentATMState;
    }

    public static ATM getAtmObject() {
        atmObject.setCurrentATMState(new IdleState());
        return atmObject;
    }

    public ATMState getCurrentATMState() {
        return currentATMState;
    }

    public void setAtmBalance(int atmBalance,int noOfTwoThousandNotes,int noOfFiveHundredNotes,int noOfOneHundredNotes){
        this.atmBalance = atmBalance;
        this.noOfOneHundredNotes = noOfOneHundredNotes;
        this.noOfFiveHundredNotes = noOfFiveHundredNotes;
        this.noOfTwoThousandNotes = noOfTwoThousandNotes;
    }

    public int getAtmBalance() {
        return atmBalance;
    }

    public int getNoOfTwoThousandNotes() {
        return noOfTwoThousandNotes;
    }

    public int getNoOfFiveHundredNotes() {
        return noOfFiveHundredNotes;
    }

    public int getNoOfOneHundredNotes() {
        return noOfOneHundredNotes;
    }

    public void deductATMBalance(int amount){
        atmBalance -= amount;
    }
    public void deductTwoThousandNotes(int number){
        noOfTwoThousandNotes-=number;
    }
    public void deductFiveHundredNotes(int number) {
        noOfFiveHundredNotes = noOfFiveHundredNotes - number;
    }

    public void deductOneHundredNotes(int number) {
        noOfOneHundredNotes = noOfOneHundredNotes - number;
    }

    public void printCurrentATMStatus(){
        System.out.println("Balance: " + atmBalance);
        System.out.println("2kNotes: " + noOfTwoThousandNotes);
        System.out.println("500Notes: " + noOfFiveHundredNotes);
        System.out.println("100Notes: " + noOfOneHundredNotes);

    }


}
