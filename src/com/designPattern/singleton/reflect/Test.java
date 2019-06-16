package com.designPattern.singleton.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 模拟反射创建对象,使得单例失效
 */
public class Test {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        /*HungrySingleton instance = HungrySingleton.getInstance();
        Class<?> aClass = Class.forName("com.designPattern.singleton.reflect.HungrySingleton");
        Constructor<?> declaredConstructor = aClass.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);
        HungrySingleton newInstance = (HungrySingleton) declaredConstructor.newInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);*/

        StaticInnerClassSingleton  staticInnerClassSingleton = StaticInnerClassSingleton.getInstance();
        Class<?> bClass = Class.forName("com.designPattern.singleton.reflect.StaticInnerClassSingleton");
        Constructor<?> constructor = bClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        StaticInnerClassSingleton staticInnerClassSingleton2 = (StaticInnerClassSingleton) constructor.newInstance();
        System.out.println(staticInnerClassSingleton);
        System.out.println(staticInnerClassSingleton2);
        System.out.println(staticInnerClassSingleton==staticInnerClassSingleton2);

    }
}
