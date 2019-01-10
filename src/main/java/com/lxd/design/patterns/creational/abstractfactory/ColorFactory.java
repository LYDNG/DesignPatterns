package com.lxd.design.patterns.creational.abstractfactory;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class ColorFactory extends AbstractFactory{
    public Color getColor(String color) {
        if(color == null){
            return null;
        }
        if(color.equalsIgnoreCase("RED")){
            return new Red();
        } else if(color.equalsIgnoreCase("GREEN")){
            return new Green();
        } else if(color.equalsIgnoreCase("BLUE")){
            return new Blue();
        }
        return null;
    }

    public Shape getShape(String shape) {
        return null;
    }
}

class Red implements Color {
    public void fill() {
        System.out.println("Inside Red::fill() method.");
    }
}

class Green implements Color {
    public void fill() {
        System.out.println("Inside Green::fill() method.");
    }
}

class Blue implements Color {
    public void fill() {
        System.out.println("Inside Blue::fill() method.");
    }
}