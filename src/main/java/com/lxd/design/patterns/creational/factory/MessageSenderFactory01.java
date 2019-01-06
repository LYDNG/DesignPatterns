package com.lxd.design.patterns.creational.factory;

import com.lxd.design.patterns.MailMessageSender;
import com.lxd.design.patterns.MessageSender;
import com.lxd.design.patterns.QQMessageSender;
import com.lxd.design.patterns.SmsMessageSender;

/**
 * 简单工厂模式
 * -see org.springframework.beans.factory.BeanFactory
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public class MessageSenderFactory01 {

    public MessageSender getMessageSender(String type) {
        if ("mail".equals(type)) {
            return new MailMessageSender();
        } else if ("sms".equals(type)) {
            return new SmsMessageSender();
        } else if ("qq".equals(type)) {
            return new QQMessageSender();
        } else {
            return null;
        }

    }

    public static void main(String[] args) {

        MessageSenderFactory01 factory = new MessageSenderFactory01();
        MessageSender messageSender = null;

        messageSender = factory.getMessageSender("mail");
        //messageSender = factory.getMessageSender("sms");
        //messageSender = factory.getMessageSender(null);

        messageSender.SendMessage();
    }
}





