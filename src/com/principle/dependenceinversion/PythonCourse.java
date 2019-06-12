package com.principle.dependenceinversion;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class PythonCourse implements ICourse {
    private String name;

    public PythonCourse(){
        this.name = "Python Course";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
