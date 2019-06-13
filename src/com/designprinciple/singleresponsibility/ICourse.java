package com.designprinciple.singleresponsibility;

/**
 * 未实现单一职责,当需要修改课程信息方法时,需要修改该接口
 *             当需要修改课程管理方法时,需要修改该接口
 */
public interface ICourse  {

    //课程信息
    String getName();
    Byte[] getCourse();

    //管理课程
    void update();
    void delete();
}
