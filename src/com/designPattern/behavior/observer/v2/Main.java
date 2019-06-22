package com.designPattern.behavior.observer.v2;

import com.designPattern.behavior.observer.v2.observer.CurrentConditionDisplay;
import com.designPattern.behavior.observer.v2.subject.Subject;
import com.designPattern.behavior.observer.v2.subject.WeatherData;

public class Main {
    public static void main(String[] args) {
        Subject weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ((WeatherData) weatherData).setMeasurements(1d,2d,3d);
    }
}
