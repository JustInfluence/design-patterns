public class WeatherData {
  public void meansurementsChanged() {
    float temp = getTemperature();
    float humidity = getHumidity();
    float pressure =  getPressure();

    currentConditionsDisplay.update(temp, humidity, pressure);
    statisticsDisplay.update(temp, humidity, pressure );
    forecastDisplay.update(temp, humidity, pressure );
  }
}
