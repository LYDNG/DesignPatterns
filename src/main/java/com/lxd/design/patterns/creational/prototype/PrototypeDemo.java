package com.lxd.design.patterns.creational.prototype;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class PrototypeDemo {
    private static PrototypeObject prototypeObject = new PrototypeObject();

    public PrototypeObject getPrototypeObject() {
        return prototypeObject.clone();
    }

    public static void main(String[] args) {
        PrototypeDemo prototypeDemo = new PrototypeDemo();
        PrototypeObject duplicate = prototypeDemo.getPrototypeObject();
    }
}
