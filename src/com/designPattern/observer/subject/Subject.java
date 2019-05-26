package com.designPattern.observer.subject;

        import com.designPattern.observer.observer.Observer;

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
