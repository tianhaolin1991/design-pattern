package com.designPattern.behavior.observer;

import com.designPattern.behavior.observer.Course;
import com.designPattern.behavior.observer.Question;
import com.designPattern.behavior.observer.Teacher;

/**
 * Course是被观察者(主题),当有学生在课程下提问时,该主题发布事件
 * Teacher是观察者(observer),它会被调用update方法,执行Update中的逻辑
 */
public class Test {
    public static void main(String[] args) {
        Course course = new Course("Java提升课程");
        Question question = new Question();
        question.setUsername("Mr.Tian");
        question.setQuestionContent("你吃shi吗?");

        Teacher geely = new Teacher("Geely");
        Teacher geely2 = new Teacher("Geely2");
        Teacher geely3 = new Teacher("Geely3");


        course.addObserver(geely);
        course.addObserver(geely2);
        course.addObserver(geely3);

        course.notify(question);

    }
}
