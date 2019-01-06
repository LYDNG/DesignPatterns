package com.lxd.design.patterns;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class Computer {
    private String cpu;
    private String memory;
    private String mainboard;
    private String keyboard;

    public Computer(){

    }
    public Computer(String cpu, String memory, String mainboard, String keyboard) {
        this.cpu = cpu;
        this.memory = memory;
        this.mainboard = mainboard;
        this.keyboard = keyboard;
    }


    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public void setKeyboard(String keyboard) {
        this.keyboard = keyboard;
    }
}