package DesignATM.ATMStates;

import DesignATM.USERHOLDER.*;

public class IdleState extends ATMState{
    @Override
    public void insertCard(ATM atm, Card card) {
        System.out.println("Card is inserted");
        atm.setCurrentATMState(new HasCardState());

    }
}
