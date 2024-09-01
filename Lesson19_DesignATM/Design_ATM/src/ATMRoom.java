import DesignATM.USERHOLDER.*;

public class ATMRoom {
    ATM atm;
    User user;

    public static void main(String args[]) {

        ATMRoom atmRoom = new ATMRoom();
        atmRoom.initialize();

        atmRoom.atm.printCurrentATMStatus();
        atmRoom.atm.getCurrentATMState().insertCard(atmRoom.atm, atmRoom.user.card);
        System.out.println(atmRoom.atm.getCurrentATMState());
        atmRoom.atm.getCurrentATMState().authenticatePin(atmRoom.atm, atmRoom.user.card, 112211);
        System.out.println(atmRoom.atm.getCurrentATMState());

        atmRoom.atm.getCurrentATMState().selectOperation(atmRoom.atm, atmRoom.user.card, TransactionType.CASH_WITHDRAWAL);
        System.out.println(atmRoom.atm.getCurrentATMState());

        atmRoom.atm.getCurrentATMState().cashWithdrawl(atmRoom.atm, atmRoom.user.card, 2700);
        System.out.println(atmRoom.atm.getCurrentATMState());

        atmRoom.atm.printCurrentATMStatus();

    }

    private void initialize() {

        //create ATM
        atm = ATM.getAtmObject();
        atm.setAtmBalance(3500, 1,2,5);
        //create User
        this.user = createUser();
    }

    private User createUser(){

        User user = new User();
        user.setCard(createCard());
        return user;
    }

    private Card createCard(){

        Card card = new Card();
        card.setBankAccount(createBankAccount());
        return card;
    }

    private UserBankAccount createBankAccount() {

        UserBankAccount bankAccount = new UserBankAccount();
        bankAccount.balance = 3000;

        return bankAccount;

    }

}
