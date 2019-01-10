package com.lxd.design.patterns.structural.facade;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class Computer {
    private Memory memory;
    private Disk disk;

    public Computer() {
        memory = new Memory();
        disk = new Disk();
    }

    public void start() {
        memory.load();
        disk.load();
    }
}

class Memory {
    public void load() {

    }
}

class Disk {
    public void load() {

    }
}
