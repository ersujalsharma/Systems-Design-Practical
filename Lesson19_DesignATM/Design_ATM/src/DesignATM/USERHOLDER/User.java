package DesignATM.USERHOLDER;

public class User {
    public Card card;
//    public UserBankAccount userBankAccount;
    public Card getCard(){
        return card;
    }
    public void setCard(Card card){
        this.card = card;
    }
}
