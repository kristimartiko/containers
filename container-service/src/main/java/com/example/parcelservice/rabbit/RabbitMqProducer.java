package com.example.parcelservice.rabbit;

import com.example.parcelservice.entity.ContainerEntity;
import com.example.parcelservice.service.ContainerService;
import lombok.Data;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
@RequestMapping("/api")
public class RabbitMqProducer implements CommandLineRunner {

    final RabbitTemplate rabbitTemplate;
    final ContainerService parcelService;

    @Override
    public void run(String... args) throws Exception {
        rabbitTemplate.convertAndSend(RabbitConfiguration.EXCHANGE, RabbitConfiguration.ROUTING_KEY, parcelService.getAllParcels());
    }
}

