package com.designprinciple.ocp;

/**
 * @author:tianhaolin
 * @version:1.0
 */
public class JavaDiscountCourse extends JavaCourse {

    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getDiscountPrice(Double discount){
        return super.getPrice()*discount;
    }
}
