package com.lxd.design.patterns.creational.factorymethod;


import com.lxd.design.patterns.MailMessageSender;
import com.lxd.design.patterns.MessageSender;

/**
 * 工厂方法模式
 * org.springframework.beans.factory.FactoryBean
 * @Author lixiaodong
 * @Version V1.0.0
 * @Date 2019-01-06
 */
public class MailMessageSenderFactory implements MessageSenderFactory{

    public MessageSender getMessageSender() {
        return new MailMessageSender();
    }
}


