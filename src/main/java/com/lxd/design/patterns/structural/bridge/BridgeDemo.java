package com.lxd.design.patterns.structural.bridge;

/**
 * 用于把抽象化与实现化解耦，使得二者可以独立变化
 * 软件系统中某个类存在两个独立变化的维度，通过该模式可以将这两个维度分离出来，使两者可以独立扩展，让系统更加符合“单一职责原则”
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class BridgeDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
