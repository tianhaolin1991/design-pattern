package com.designprinciple.demeter.undo;

import com.designprinciple.demeter.Course;

import java.util.ArrayList;

public class Boss {
    public void commandCourseCount(TeamLeader teamLeader){
        ArrayList<Course> courses = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            Course course = new Course();
            courses.add(course);
        }
        teamLeader.checkNumberOfCourse(courses);
    }
}
