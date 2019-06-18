package com.designPattern.create.singleton.serialize;


import java.io.*;

/**
 * 模拟序列化/反序列化破坏单例
 */
public class Test {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        DoubleCheckLazySingleton instance = DoubleCheckLazySingleton.getInstance();
        String filepath = "singleton_file";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filepath));
        oos.writeObject(instance);

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filepath));
        DoubleCheckLazySingleton newInstance = (DoubleCheckLazySingleton)ois.readObject();
        System.out.println(instance);
        System.out.println(newInstance);
    }
}
