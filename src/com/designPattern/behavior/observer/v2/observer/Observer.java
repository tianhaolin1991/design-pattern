package com.designPattern.behavior.observer.v2.observer;

public interface Observer {

    /**
     * 更新数据
     * @param temperature
     * @param humidity
     * @param pressure
     */
    void update(double temperature,double humidity,double pressure);
}
