package com.example.parcelservice.rabbit;

import com.example.parcelservice.service.ContainerService;
import lombok.Data;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Data
@RequestMapping("/api")
public class RabbitMqProducer {

    final RabbitTemplate rabbitTemplate;
    final ContainerService parcelService;

    @GetMapping("/containers")
    public String getMessage() {
        rabbitTemplate.convertAndSend(RabbitConfiguration.EXCHANGE, RabbitConfiguration.ROUTING_KEY, parcelService.getAllParcels());
        return "Message Published";
    }
}

