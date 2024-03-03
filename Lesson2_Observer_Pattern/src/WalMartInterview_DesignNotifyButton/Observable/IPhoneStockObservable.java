package WalMartInterview_DesignNotifyButton.Observable;

import WalMartInterview_DesignNotifyButton.Observer.NotificationAlertObserver;

import java.util.*;

public class IPhoneStockObservable implements StockObservable{
    List<NotificationAlertObserver> list = new ArrayList<>();
    int current_data = 0;
    @Override
    public void add(NotificationAlertObserver notificationAlertObserver) {
        list.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver) {
        list.remove(notificationAlertObserver);
    }

    @Override
    public void notifyHelp() {
        for(NotificationAlertObserver notificationAlertObserver : list){
            notificationAlertObserver.update();
        }
    }

    @Override
    public void setData(int newData) {
        if(current_data != newData){
            current_data = newData;
            notifyHelp();
        }
    }

    @Override
    public int getData() {
        return current_data;
    }

    @Override
    public String toString() {
        return getClass().getName();
    }
}
