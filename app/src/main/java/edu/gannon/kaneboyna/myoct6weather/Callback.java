package edu.gannon.kaneboyna.myoct6weather;

public interface Callback {
    void success(Weather currentWeather);
    void error(ErrorType error);
}
