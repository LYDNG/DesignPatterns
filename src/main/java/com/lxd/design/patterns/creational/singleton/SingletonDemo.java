package com.lxd.design.patterns.creational.singleton;

/**
 * 某个类只能有一个实例，提供一个全局的访问点
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class SingletonDemo {
    public static void main(String[] args) {
        SingletonObject01 singletonObject01 = SingletonObject01.getSingletonObject();
        SingletonObject02 singletonObject02 = SingletonObject02.getSingletonObject();
        //@org.springframework.context.annotation.Scope("singleton")
    }

}
