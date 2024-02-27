package WeatherWorkStation.Observerable;

import WeatherWorkStation.Observer.DisplayObserver;

public interface WeatherStationInterface {
    void add(DisplayObserver displayObserver);
    void remove(DisplayObserver displayObserver);
    void notifyHelp();
    void setData(int newData);
    int getData();
}