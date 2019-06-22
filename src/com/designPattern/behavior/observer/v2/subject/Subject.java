package com.designPattern.behavior.observer.v2.subject;

        import com.designPattern.behavior.observer.v2.observer.Observer;

public interface Subject {

    /**
     * 注册观察者
     */
    void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知观察者
     */
    void notifyObserver();
}
