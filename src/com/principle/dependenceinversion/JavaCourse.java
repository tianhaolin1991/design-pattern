package com.principle.dependenceinversion;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaCourse implements ICourse {
    private String name;

    public JavaCourse(){
        this.name = "JAVA Course";
    }
    @Override
    public String getName() {
        return this.name;
    }
}
