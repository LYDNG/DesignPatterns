package com.lxd.design.patterns.behavioral.command;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public interface Command {
    void Execute();
}

class CopyCommand implements Command {

    private Cpu cpu;

    public CopyCommand(Cpu c) {
        cpu = c;
    }

    public void Execute() {
        cpu.doCopy();
    }
}

class PasteCommand implements Command {

    private Cpu cpu;

    public PasteCommand(Cpu c) {
        cpu = c;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public void Execute() {
        cpu.doPaste();
    }
}

