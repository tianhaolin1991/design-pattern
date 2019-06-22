package com.designPattern.behavior.observer.v2.observer;

import com.designPattern.behavior.observer.v2.subject.Subject;

public class CurrentConditionDisplay implements DisplayElement,Observer {
    private double temperature;
    private double humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }
    @Override
    public void display() {
        System.out.println("Current weather data is : temperature--"+ temperature +",humidity--" + humidity );
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        display();
    }

    public void deregister(){
        weatherData.removeObserver(this);
    }
}
