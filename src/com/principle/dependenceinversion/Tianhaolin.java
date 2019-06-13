package com.principle.dependenceinversion;



/**
 * @author:tianhaolin
 * @version:1.0
 */
public class Tianhaolin {

    public void learn(ICourse course){
        System.out.println("Tianhaolin在学习"+course.getName());
    }
}
