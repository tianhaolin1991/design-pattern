package com.designPattern.swagger;

/**
 * 饮料类(基类)
 */
public abstract class Beverage {

    private String description;

    public String getDescription(){
        return this.description;
    }

    /**
     * 计算价格
     * @return
     */
    public abstract double cost();

    public void setDescription(String description){
        this.description = description;
    }
}
