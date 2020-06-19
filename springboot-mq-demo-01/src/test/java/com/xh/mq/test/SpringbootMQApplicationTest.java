package com.xh.mq.test;

import com.xh.mq.service.JmsProducerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Title:
 * Description:
 *
 * @author H.Yang
 * @email xhaimail@163.com
 * @date 2020/6/9
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootMQApplicationTest {

    @Autowired
    private JmsProducerService jmsProducerService;//使用该模板类发送消息

    @Test
    public void sendMessage() {
        //向Queue中发送文本消息
        jmsProducerService.sendMessageToQueue("active.queue.msg", "QUEUE消息内容");
    }
}
