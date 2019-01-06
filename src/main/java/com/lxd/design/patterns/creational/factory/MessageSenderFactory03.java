package com.lxd.design.patterns.creational.factory;

import com.lxd.design.patterns.MailMessageSender;
import com.lxd.design.patterns.MessageSender;
import com.lxd.design.patterns.QQMessageSender;
import com.lxd.design.patterns.SmsMessageSender;

/**
 * 多个静态方法 为不同的实现提供不同的静态方法
 * 不需要创建工厂类实例
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class MessageSenderFactory03 {

    public static MessageSender getMailMessageSender() {
        return new MailMessageSender();
    }

    public static MessageSender getSmsMessageSender() {
        return new SmsMessageSender();
    }

    public static MessageSender getQQMessageSender() {
        return new QQMessageSender();
    }

    public static void main(String[] args) {
        MessageSender messageSender = null;
        messageSender = MessageSenderFactory03.getMailMessageSender();
        //messageSender = MessageSenderFactory03.getSmsMessageSender();
        //messageSender = MessageSenderFactory03.getQQMessageSender();

        messageSender.SendMessage();
    }
}
