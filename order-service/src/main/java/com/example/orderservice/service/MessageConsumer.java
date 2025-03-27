package com.example.orderservice.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class MessageConsumer {

    @KafkaListener(topics = "parcel-topic", groupId = "my-group-id")
    public void listen(String message) {
        System.out.println("Received Messasge in group my-group-id: " + message);
    }
}
