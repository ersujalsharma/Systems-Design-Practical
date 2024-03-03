package WeatherWorkStation.Observer;

import WeatherWorkStation.Observerable.WeatherStationInterface;

public class TVDisplayObserverImpl implements DisplayObserver{

    WeatherStationInterface weatherStationInterface;
    String name;
    public TVDisplayObserverImpl(String name, WeatherStationInterface weatherStationInterface){
        this.name = name;
        this.weatherStationInterface = weatherStationInterface;
    }
    @Override
    public void update() {
        System.out.println(name +": The updated value by "+weatherStationInterface+"is "+weatherStationInterface.getData());
    }
}
