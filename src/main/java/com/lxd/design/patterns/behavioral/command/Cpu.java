package com.lxd.design.patterns.behavioral.command;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public interface Cpu {
    void doCopy();

    void doPaste();
}

class IntelCpu implements Cpu {

    public void doCopy() {
        System.out.println("IntelCpu doCopy done");
    }

    public void doPaste() {
        System.out.println("IntelCpu doPaste done");
    }
}