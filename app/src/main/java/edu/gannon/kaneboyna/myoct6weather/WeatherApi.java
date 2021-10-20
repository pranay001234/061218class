package edu.gannon.kaneboyna.myoct6weather;

public interface WeatherApi {
    void getWeatherForZipCode(String zipCode, Callback callback);
}
