package WalMartInterview_DesignNotifyButton.Observer;

import WalMartInterview_DesignNotifyButton.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    long mobileNo;
    StockObservable stockObservable;
    public MobileAlertObserver(long mobileNo, StockObservable stockObservable){
        this.mobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }
    @Override
    public void update() {
        System.out.println("Message sent to -> "+mobileNo+" As we used this"+stockObservable+" Observable");
    }
}
