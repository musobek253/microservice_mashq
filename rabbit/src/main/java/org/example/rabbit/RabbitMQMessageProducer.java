package org.example.rabbit;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
@Slf4j
public class RabbitMQMessageProducer {

    private final   AmqpTemplate amqpTemplate;

    public void publish(Object payload, String exchange,String rootingKey){
        log.info("Publishing to {} using routingKey {}. Payload: {}",exchange,rootingKey,payload);
        amqpTemplate.convertAndSend(exchange,rootingKey,payload);
        log.info("Published to {} using routingKey {}. Payload: {}",exchange,rootingKey,payload);
    }
}
