package com.designPattern.behavior.observer;

import java.util.Observable;

/**
 * 被观察者,继承Observable
 */
public class Course extends Observable {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void notify(Question question){
        System.out.println(question.getUsername()+"提出了一个问题:"+question.getQuestionContent());
        super.setChanged();
        super.notifyObservers(question);
    }
}
