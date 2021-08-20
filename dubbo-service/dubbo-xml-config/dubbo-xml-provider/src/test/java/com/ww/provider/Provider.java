package com.ww.provider;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @author xiaohua
 * @description xml配置服务提供者测试
 * @date 2021-8-20 13:52
 */
public class Provider {

    private static final Logger logger = LoggerFactory.getLogger(Provider.class);

    @Test
    public void test() throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        context.start();
        logger.info("[服务提供者]服务暴露成功，等待调用...");

        System.in.read();
    }
}
