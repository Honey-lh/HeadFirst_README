package Observer_test;

import java.util.Observable;
import java.util.Observer;

public class ClientConditionDisplay implements Observer {

    Observable observable;
    private float temperature;
    private float humidity;

    public void ClientConditionDisplay(Observable observable){
        this.observable=observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if(o instanceof WeatherData){
            WeatherData weatherData=(WeatherData)o;
            this.temperature=weatherData.getTemperature();
            this.humidity=weatherData.getHumidity();
            diplay();
        }
    }

    private void diplay(){};
}
