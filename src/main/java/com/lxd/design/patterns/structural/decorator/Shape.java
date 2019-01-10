package com.lxd.design.patterns.structural.decorator;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public interface Shape {
    void draw();
}

class Rectangle implements Shape {

    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape {

    public void draw() {
        System.out.println("Shape: Circle");
    }
}

abstract class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape){
        this.decoratedShape = decoratedShape;
    }

    public void draw(){
        decoratedShape.draw();
    }
}
class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }

    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }
}

