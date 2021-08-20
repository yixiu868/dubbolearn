package com.ww.consumer;

import com.ww.service.UserService;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author xiaohua
 * @description 消费者测试
 * @date 2021-8-20 14:00
 */
public class ConsumerTest {

    private static final Logger logger = LoggerFactory.getLogger(ConsumerTest.class);

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-application.xml");
        context.start();

        UserService userService = (UserService) context.getBean("userService");
        logger.info("[消费者]获取到useService代理实现");
        userService.findUserById(1);
        logger.info("[消费者]调用代理对象方法成功");
    }
}
