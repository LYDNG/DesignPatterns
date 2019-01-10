package com.lxd.design.patterns.behavioral.command;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class Windows {

    public void doCommand(Command command){
        //这里扩展各种Command的执行规则
        command.Execute();
    }

}
