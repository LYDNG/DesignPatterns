package com.lxd.design.patterns.creational.factorymethod;

import com.lxd.design.patterns.MessageSender;

/**
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-06
 */
public interface MessageSenderFactory{
    MessageSender getMessageSender();
}
