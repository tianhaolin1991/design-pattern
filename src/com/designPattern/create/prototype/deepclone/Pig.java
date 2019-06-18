package com.designPattern.create.prototype.deepclone;

import java.util.Date;

/**这是深克隆的一个例子,我们主要关注的是birthday属性(因为它不是一个基本类型)
 * 和clone()方法的变化
 * @author:tianhaolin
 * @version:1.0
 */
public class Pig implements Cloneable{
    private String name;
    private Date birthday;

    public Pig(String name,Date birthday){
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
        return super.clone();
    }
}
