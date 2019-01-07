package com.canon4g.provider.MQ;

import com.canon4g.provider.model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * create by Canon4G 2019-01-07
 **/
@Component
public class MQSender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send() {
//        amqpTemplate.convertAndSend("queue", "hello, rabbit~");
        User user = new User();
        user.setUserName("canon4G");
        amqpTemplate.convertAndSend("queue", user);
    }
}
