package WalMartInterview_DesignNotifyButton.Observer;

import WalMartInterview_DesignNotifyButton.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String email;
    StockObservable stockObservable;
    public EmailAlertObserver(String email, StockObservable stockObservable){
        this.email = email;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Email sent to -> "+email+" As we used this"+stockObservable+" Observable");
    }
}
