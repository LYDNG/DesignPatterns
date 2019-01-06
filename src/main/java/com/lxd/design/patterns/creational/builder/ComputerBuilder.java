package com.lxd.design.patterns.creational.builder;

import com.lxd.design.patterns.Computer;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class ComputerBuilder implements Builder<Computer> {
    private String cpu;
    private String memory;
    private String mainboard;
    private String keyboard;

    public ComputerBuilder setCpu(String cpu) {
        this.cpu = cpu;
        return this;
    }

    public ComputerBuilder setMemory(String memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder setMainboard(String mainboard) {
        this.mainboard = mainboard;
        return this;
    }

    public ComputerBuilder setKeyboard(String keyboard) {
        this.keyboard = keyboard;
        return this;
    }

    public Computer build() {
        return new Computer(cpu, memory, mainboard, keyboard);
    }
}
