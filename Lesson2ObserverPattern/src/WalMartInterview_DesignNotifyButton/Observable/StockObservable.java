package WalMartInterview_DesignNotifyButton.Observable;

import WalMartInterview_DesignNotifyButton.Observer.NotificationAlertObserver;

public interface StockObservable {
    void add(NotificationAlertObserver notificationAlertObserver);
    void remove(NotificationAlertObserver notificationAlertObserver);
    void notifyHelp();
    void setData(int newData);
    int getData();

}
