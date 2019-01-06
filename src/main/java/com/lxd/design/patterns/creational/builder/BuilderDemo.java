package com.lxd.design.patterns.creational.builder;

import com.lxd.design.patterns.Computer;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class BuilderDemo {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder()
                .setCpu("Intel").setKeyboard("Razer").setMainboard("GIGABYTE").setMemory("Kingston").build();

        assert computer != null;
    }
}
