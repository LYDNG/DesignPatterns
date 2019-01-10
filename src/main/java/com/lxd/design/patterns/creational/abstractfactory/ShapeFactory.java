package com.lxd.design.patterns.creational.abstractfactory;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class ShapeFactory extends AbstractFactory {
    public Color getColor(String color) {
        return null;
    }

    public Shape getShape(String shapeType) {
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }
        return null;
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}

class Square implements Shape {

    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}