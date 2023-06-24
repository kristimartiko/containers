package com.example.orderservice.rabbit;

import com.example.orderservice.entity.ContainerEntity;
import com.example.orderservice.repositories.ContainerRepository;
import com.example.orderservice.repositories.OrderRepository;
import com.example.orderservice.service.OrderService;
import lombok.Data;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Component
@Data
public class RabbitReciever {

    private static final Logger logger = LoggerFactory.getLogger(RabbitReciever.class);
    private final OrderRepository orderRepository;
    private final ContainerRepository containerRepository;
    private final OrderService orderService;

    @RabbitListener(queues = RabbitConfiguration.QUEUE)
    public void listen(List<ContainerEntity> message) {
        for (ContainerEntity entity : message) {
            logger.info("Message is: {}, {}, {}, {}, {}", entity.getContainerId().toString(), entity.getDescription(), entity.getAcceleration(), entity.getHumidity(), entity.getTemperature());
            Optional<ContainerEntity> container = containerRepository.findById(entity.getContainerId());
            if (container.isEmpty() || !orderService.checkIfExists(container.get(), entity)) {
                containerRepository.save(entity);
            }
        }
    }
}
