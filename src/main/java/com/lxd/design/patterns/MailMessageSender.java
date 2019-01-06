package com.lxd.design.patterns;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class MailMessageSender implements MessageSender{
    public boolean SendMessage() {
        System.out.println("我会发送邮件");
        return false;
    }
}
