package com.lxd.design.patterns.creational.abstractfactory;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String color);
    public abstract Shape getShape(String shape) ;
}
