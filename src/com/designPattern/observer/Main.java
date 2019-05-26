package com.designPattern.observer;

import com.designPattern.observer.observer.CurrentConditionDisplay;
import com.designPattern.observer.subject.Subject;
import com.designPattern.observer.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ((WeatherData) weatherData).setMeasurements(1d,2d,3d);
    }
}
