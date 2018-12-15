public class WeatherStation {
  public static void main(String[] args) {
    WeatherData wd = new WeatherData();
    CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);

    wd.setMeasurements(1, 2, 12.5f);
  }
}
