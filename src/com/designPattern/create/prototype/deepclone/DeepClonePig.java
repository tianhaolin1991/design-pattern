package com.designPattern.create.prototype.deepclone;

import java.util.Date;

/**这是深克隆的一个例子,我们主要关注的是birthday属性(因为它不是一个基本类型)
 * 和clone()方法的变化
 * 深克隆的秘密就是在clone()方法中,对被克隆对象的所有属性(引用对象)再进行一次clone()
 * @author:tianhaolin
 * @version:1.0
 */
public class DeepClonePig implements Cloneable{
    private String name;
    private Date birthday;

    public DeepClonePig(String name,Date birthday){
        this.name = name;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Pig{" +
                "name='" + name + '\'' +
                ", birthday=" + birthday +
                '}'+super.toString();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
     //   return super.clone();
        DeepClonePig clone = (DeepClonePig)super.clone();
        clone.setBirthday((Date) clone.getBirthday().clone());
        return clone;
    }
}
