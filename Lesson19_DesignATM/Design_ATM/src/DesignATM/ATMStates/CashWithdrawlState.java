package DesignATM.ATMStates;

import DesignATM.AmountWithdrawl.CashWithdrawProcessor;
import DesignATM.AmountWithdrawl.FiveHundredWithdrawProcessor;
import DesignATM.AmountWithdrawl.OneHundredWithdrawProcessor;
import DesignATM.AmountWithdrawl.TwoThousandWithdrawProcessor;
import DesignATM.USERHOLDER.*;

public class CashWithdrawlState extends ATMState{
    public CashWithdrawlState() {
        System.out.println("Please enter the Withdrawal Amount");
    }

    public void cashWithdrawl(ATM atmObject, Card card, int withdrawalAmountRequest) {

        if (atmObject.getAtmBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atmObject);
        } else if (card.getBankBalance() < withdrawalAmountRequest) {
            System.out.println("Insufficient fund in the your Bank Account");
            exit(atmObject);
        } else {

            card.deductBankBalance(withdrawalAmountRequest);
            atmObject.deductATMBalance(withdrawalAmountRequest);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atmObject, withdrawalAmountRequest);
            exit(atmObject);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentATMState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
