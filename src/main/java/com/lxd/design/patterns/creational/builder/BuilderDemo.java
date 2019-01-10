package com.lxd.design.patterns.creational.builder;

import com.lxd.design.patterns.Computer;

/**
 * 将一个复杂的构建与其表示相分离，使得同样的构建过程可以创建不同的表示
 * 分布构建
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
