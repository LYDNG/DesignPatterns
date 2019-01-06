package com.lxd.design.patterns;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class QQMessageSender implements MessageSender{
    public boolean SendMessage() {
        System.out.println("我会发送其他类型信息");
        return false;
    }
}
