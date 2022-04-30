package tw.com.rex.pattern.model.observer;

public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;
    private float humidity;
    private final WeatherDate weatherDate;

    public CurrentConditionsDisplay(WeatherDate weatherDate) {
        this.weatherDate = weatherDate;
        weatherDate.registerObserver(this);
    }

    @Override
    public void update() {
        this.temperature = weatherDate.getTemperature();
        this.humidity = weatherDate.getHumidity();
        display();
    }

    @Override
    public void display() {
        System.out.println("Current conditions: " + temperature + "F degrees and " + humidity + "% humidity");
    }

}
