package com.example.orderservice.controller;

import com.example.orderservice.OrderDto;
import com.example.orderservice.entity.ContainerEntity;
import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.repositories.OrderRepository;
import com.example.orderservice.service.OrderService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Data
public class OrderController {

    final OrderRepository orderRepository;
    final OrderService orderService;
    @GetMapping("orders")
    public List<OrderEntity> allOrders() {
        return orderRepository.findAll();
    }

    @PostMapping("addOrder/{id}")
    public void addOrder(@RequestBody OrderDto orderDto, @PathVariable Long id) {
        this.orderService.addOrder(orderDto, id);
    }
}
