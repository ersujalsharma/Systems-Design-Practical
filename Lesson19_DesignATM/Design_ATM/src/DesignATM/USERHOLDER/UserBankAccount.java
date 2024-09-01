package DesignATM.USERHOLDER;

public class UserBankAccount {
    public int balance;
    public void withdrawlBalance(int amount){
        balance -= amount;
    }
}
