package com.example.orderservice.rabbit;

import com.example.orderservice.entity.ContainerEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.concurrent.CountDownLatch;

@Component
public class RabbitReciever {

    private static final Logger logger = LoggerFactory.getLogger(RabbitReciever.class);

    @RabbitListener(queues = RabbitConfiguration.QUEUE)
    public void listen(List<ContainerEntity> message) {
        for (ContainerEntity entity: message) {
            logger.info("Message is: {}, {}, {}, {}, {}", entity.getContainerId().toString(), entity.getDescription(), entity.getAcceleration(), entity.getHumidity(), entity.getTemperature());
        }

    }
}
