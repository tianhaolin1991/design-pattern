package com.designPattern.create.prototype.clone;

/**假设Mail是一个非常繁琐的对象,在例子中不会这么繁琐
 * 为了使用原型模式,Mail必须实现Cloneable接口,并重写clone方法
 * !!!注意,clone()方法是object的,不是Cloneable(它是一个声明式接口)的
 * !!!注意,这里clone()方法的实现是潜克隆,它克隆出来对象的属性和原对象的属性指向同一个地址
 * !!!注意,可以进入deepclone包内的另外一个例子来学习深浅克隆
 * @author:tianhaolin
 * @version:1.0
 */
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;

    public Mail(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
