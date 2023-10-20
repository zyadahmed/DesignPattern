public class StatisticsDisplay implements Observer, DisplayElement {
    private float minTemperature ;
    private float maxTemperature ;
    private float minHumidity ;
    private float maxHumidity ;

    private boolean firstUpdate ;
    WeatherData weatherData;
    public StatisticsDisplay(WeatherData weatherData){
        this.weatherData = weatherData;
        minTemperature = Float.MAX_VALUE;
        maxTemperature = Float.MIN_VALUE;
        minHumidity = Float.MAX_VALUE;
        maxHumidity = Float.MIN_VALUE;

        firstUpdate = true;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Min Max Temperature: " + minTemperature + " / " + maxTemperature);
        System.out.println("Min Max Humidity: " + minHumidity + " / " + maxHumidity);
    }

    @Override
    public void upadte(float temp, float humidity, float pressure) {
        if (firstUpdate) {
            minTemperature = temp;
            maxTemperature = temp;
            minHumidity = humidity;
            maxHumidity = humidity;
            firstUpdate = false;
        } else {
            if (minHumidity > humidity) {
                minHumidity = humidity;
            }
            if (maxHumidity < humidity) {
                maxHumidity = humidity;
            }
            if (minTemperature > temp) {
                minTemperature = temp;
            }
            if (maxTemperature < temp) {
                maxTemperature = temp;
            }
        }
        display();
    }
}
