package com.lxd.design.patterns.structural.facade;

/**
 * 隐藏系统的复杂性，并向客户端提供了一个客户端可以访问系统的接口
 *
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class FacadeDemo {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.start();
    }
}
