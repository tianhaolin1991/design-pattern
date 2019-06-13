package com.designprinciple.demeter.doo;

import com.designprinciple.demeter.Course;

import java.util.ArrayList;
import java.util.List;

public class TeamLeader {

    public void checkNumberOfCourse(){

        ArrayList<Course> courseArrayList = new ArrayList<Course>();
        for (int i = 0; i < 20; i++) {
            courseArrayList.add(new Course());
        }
        System.out.println(courseArrayList.size());
    }
}
