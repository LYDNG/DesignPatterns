package com.lxd.design.patterns.behavioral.responsibilitychain;

/**
 * 责任链模式
 * 1、Struts2 的拦截器
 * 2、JS 中的事件冒泡
 * 3、JAVA WEB 中 Apache Tomcat 对 Encoding 的处理
 * 4、jsp servlet 的 Filter
 * 5、classloader
 * @author lixiaodong
 * @version V1.0.0
 * @date 2019-01-10
 */
public class ResponsibilityChainDemo {
    public static void main(String[] args) {
        AbstractLogger dbLogger = new DbLogger(AbstractLogger.ERROR);
        AbstractLogger loggerChain = dbLogger;
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        dbLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);



        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
