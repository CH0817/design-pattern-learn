package tw.com.rex.pattern;

import tw.com.rex.pattern.model.observer.CurrentConditionsDisplay;
import tw.com.rex.pattern.model.observer.WeatherDate;

public class Observer {

    public static void main(String[] args) {
        WeatherDate weatherDate = new WeatherDate();

        CurrentConditionsDisplay currentDisplay = new CurrentConditionsDisplay(weatherDate);

        weatherDate.setMeasurements(80, 65, 30.4f);
        weatherDate.setMeasurements(82, 70, 29.2f);
        weatherDate.setMeasurements(78, 90, 29.2f);
    }

}
