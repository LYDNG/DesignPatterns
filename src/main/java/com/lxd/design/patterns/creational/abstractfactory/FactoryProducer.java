package com.lxd.design.patterns.creational.abstractfactory;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        if(choice.equalsIgnoreCase("SHAPE")){
            return new ShapeFactory();
        } else if(choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        }
        return null;
    }
}
