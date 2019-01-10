package com.lxd.design.patterns.behavioral.command;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class CommandDemo {
    public static void main(String[] args) {
        Cpu cpu = new IntelCpu();
        Windows windows = new Windows();
        windows.doCommand(new CopyCommand(cpu));
        windows.doCommand(new PasteCommand(cpu));
    }
}
