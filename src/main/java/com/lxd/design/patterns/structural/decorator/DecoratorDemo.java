package com.lxd.design.patterns.structural.decorator;

/**
 * 装饰器模式（Decorator Pattern）
 * 这种模式创建了一个装饰类，用来包装原有的类，并在保持类方法签名完整性的前提下，提供了额外的功能。
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class DecoratorDemo {
    public static void main(String[] args) {

        Shape circle = new Circle();
        System.out.println("Circle with normal border");
        circle.draw();

        //使用 RedShapeDecorator 来装饰 Shape 对象
        Shape redCircle = new RedShapeDecorator(new Circle());
        System.out.println("\nCircle of red border");
        redCircle.draw();

        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }
}
