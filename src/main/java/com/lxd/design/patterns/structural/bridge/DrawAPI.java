package com.lxd.design.patterns.structural.bridge;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public interface DrawAPI {
    void drawCircle(int radius, int x, int y);
}
class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}

class GreenCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: green, radius: "
                + radius +", x: " +x+", "+ y +"]");
    }
}