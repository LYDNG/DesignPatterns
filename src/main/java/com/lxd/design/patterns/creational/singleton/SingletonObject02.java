package com.lxd.design.patterns.creational.singleton;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class SingletonObject02 {
    private SingletonObject02() {
    }

    public Object readResolve() {
        return getSingletonObject();
    }

    public static SingletonObject02 getSingletonObject() {
        return SingletonFactory.instance;
    }


    private static class SingletonFactory {
        private static SingletonObject02 instance = new SingletonObject02();
    }
}
