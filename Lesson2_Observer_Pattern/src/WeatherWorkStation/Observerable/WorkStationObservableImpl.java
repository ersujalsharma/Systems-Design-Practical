package WeatherWorkStation.Observerable;

import WeatherWorkStation.Observer.DisplayObserver;

import java.util.*;

public class WorkStationObservableImpl implements WeatherStationInterface{
    List<DisplayObserver> list = new ArrayList<>(); // SubscribersList
    int current_data;
    @Override
    public void add(DisplayObserver displayObserver) {
        list.add(displayObserver);
    }

    @Override
    public void remove(DisplayObserver displayObserver) {
        list.remove(displayObserver);
    }

    @Override
    public void notifyHelp() {
        for(DisplayObserver displayObserver : list){
            displayObserver.update();
        }
    }

    @Override
    public void setData(int new_data) {
        if(current_data != new_data){
            current_data = new_data;
            notifyHelp();
        }
    }

    @Override
    public int getData() {
        return current_data;
    }

    @Override
    public String toString() {
        return "WorkStation";
    }
}
