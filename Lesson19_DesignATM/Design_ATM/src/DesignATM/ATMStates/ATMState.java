package DesignATM.ATMStates;
import DesignATM.USERHOLDER.*;
public abstract class ATMState {
    public void insertCard(ATM atm, Card card){
        System.out.println("Something Went wrong.");
    }
    public void authenticatePin(ATM atm, Card card, int pin){
        System.out.println("Something Went wrong.");
    }
    public void selectOperation(ATM atm,Card card,TransactionType txnType){
        System.out.println("Something Went wrong.");
    }
    public void cashWithdrawl(ATM atm, Card card, int withdrawlAmount){
        System.out.println("Something Went wrong.");
    }
    public void displayBalance(ATM atm, Card card){
        System.out.println("Something Went wrong.");
    }
    public void returnCard(){
        System.out.println("Something Went wrong.");
    }
    public void exit(ATM atm){
        System.out.println("Something Went wrong.");
    }
}
