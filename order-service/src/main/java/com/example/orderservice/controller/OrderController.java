package com.example.orderservice.controller;

import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.repositories.OrderRepository;
import lombok.Data;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Data
public class OrderController {

    final OrderRepository orderRepository;

    @GetMapping("orders")
    public List<OrderEntity> allOrders() {
        return orderRepository.findAll();
    }
}
