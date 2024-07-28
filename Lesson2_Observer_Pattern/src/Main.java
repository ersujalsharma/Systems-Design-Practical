import WalMartInterview_DesignNotifyButton.Observable.IPhoneStockObservable;
import WalMartInterview_DesignNotifyButton.Observable.StockObservable;
import WalMartInterview_DesignNotifyButton.Observer.EmailAlertObserver;
import WalMartInterview_DesignNotifyButton.Observer.MobileAlertObserver;
import WalMartInterview_DesignNotifyButton.Observer.NotificationAlertObserver;
import WeatherWorkStation.Observer.DisplayObserver;
import WeatherWorkStation.Observer.MobileDisplayObserver;
import WeatherWorkStation.Observer.TVDisplayObserverImpl;
import WeatherWorkStation.Observerable.WeatherStationInterface;
import WeatherWorkStation.Observerable.WorkStationObservableImpl;

public class Main {
    public static void main(String[] args) {
//        /*
        // Weather Station Runner class
        WeatherStationInterface weatherStationInterface = new WorkStationObservableImpl(); // Observable. Ye Observe karenge

        DisplayObserver displayObserver = new TVDisplayObserverImpl("Samsung",weatherStationInterface);
        DisplayObserver displayObserver1 = new MobileDisplayObserver("IPhone",weatherStationInterface);
        System.out.println(weatherStationInterface.getData());
        weatherStationInterface.add(displayObserver);
        weatherStationInterface.add(displayObserver1);
        weatherStationInterface.setData(1);

//        */
//        /*
        // WallMartInterView Design NotifyButton Main
        // observable interface
//        StockObservable stockObservable = new IPhoneStockObservable(); // iphone stock
//        NotificationAlertObserver notificationAlertObserver1 = new MobileAlertObserver(1234567890,stockObservable);
//        NotificationAlertObserver notificationAlertObserver2 = new EmailAlertObserver("youtube@gmail.com",stockObservable);
//
//        stockObservable.add(notificationAlertObserver1);
//        stockObservable.add(notificationAlertObserver2);
//
//        stockObservable.setData(10);
        //
//        */
    }
}