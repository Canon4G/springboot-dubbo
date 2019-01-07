package com.canon4g.provider.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * create by Canon4G 2019-01-07
 **/
@Configuration
public class MQSenderConf {
    @Bean
    public Queue queue() {
        return new Queue("queue");
    }
}
