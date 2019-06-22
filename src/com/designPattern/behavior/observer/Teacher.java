package com.designPattern.behavior.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * 观察者
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    @Override
    public void update(Observable o, Object arg) {
        o.hasChanged();
        Question question = (Question) arg;
        System.out.println(this.teacherName+"收到了"+ question.getUsername()+"提出的问题:"+question.getQuestionContent());
    }
}
