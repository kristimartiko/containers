package com.example.orderservice.service;

import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.OrderDto;
import com.example.orderservice.repositories.OrderRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class OrderService {
    public final OrderRepository orderRepository;


    public void addOrder(OrderDto orderDto) {
        OrderEntity orderEntity = new OrderEntity();
                orderEntity.setOrigin(orderDto.getOrigin());
                orderEntity.setDestination(orderDto.getDestination());
                orderEntity.setCurrentLocation(orderDto.getCurrentLocation());
                orderEntity.setStartDate(orderDto.getStartDate());
                orderEntity.setArrivalDate(orderDto.getArrivalDate());
                orderEntity.setOrderDate(orderDto.getOrderDate());
    }
}
