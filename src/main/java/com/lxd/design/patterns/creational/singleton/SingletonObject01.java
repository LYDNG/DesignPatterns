package com.lxd.design.patterns.creational.singleton;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class SingletonObject01 {
    private static SingletonObject01 instance = null;

    private SingletonObject01() {
    }

    public Object readResolve() {
        return instance;
    }

    public static SingletonObject01 getSingletonObject() {
        if (instance == null) {
            synchronized (instance) {
                if (instance == null) {
                    instance = new SingletonObject01();
                }
            }
        }
        return instance;
    }
}
