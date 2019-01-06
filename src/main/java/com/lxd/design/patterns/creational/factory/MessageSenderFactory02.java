package com.lxd.design.patterns.creational.factory;

import com.lxd.design.patterns.MailMessageSender;
import com.lxd.design.patterns.MessageSender;
import com.lxd.design.patterns.QQMessageSender;
import com.lxd.design.patterns.SmsMessageSender;

/**
 * 多个工厂方法模式 为不同的实现提供不同的方法
 * 解决简单工厂模式里字符串硬编码问题
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class MessageSenderFactory02 {
    public MessageSender getMailMessageSender() {
        return new MailMessageSender();
    }

    public MessageSender getSmsMessageSender() {
        return new SmsMessageSender();
    }

    public MessageSender getQQMessageSender() {
        return new QQMessageSender();
    }


    public static void main(String[] args) {
        MessageSenderFactory02 factory = new MessageSenderFactory02();
        MessageSender messageSender = null;

        messageSender = factory.getMailMessageSender();
        //messageSender = factory.getSmsMessageSender();
        //messageSender = factory.getQQMessageSender();
        messageSender.SendMessage();
    }
}