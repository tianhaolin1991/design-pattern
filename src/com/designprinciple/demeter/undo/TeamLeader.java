package com.designprinciple.demeter.undo;

import com.designprinciple.demeter.Course;

import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourse(List<Course> courseList){
        System.out.println(courseList.size());
    }
}
