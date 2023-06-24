package com.example.orderservice.service;

import com.example.orderservice.entity.ContainerEntity;
import com.example.orderservice.entity.OrderEntity;
import com.example.orderservice.OrderDto;
import com.example.orderservice.rabbit.RabbitReciever;
import com.example.orderservice.repositories.OrderRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.awt.*;

@Service
@Data
public class OrderService {
    public final OrderRepository orderRepository;

    public void addOrder(OrderDto orderDto, Long id) {
        OrderEntity orderEntity = new OrderEntity();
                orderEntity.setOrigin(orderDto.getOrigin());
                orderEntity.setDestination(orderDto.getDestination());
                orderEntity.setCurrentLocation(orderDto.getCurrentLocation());
                orderEntity.setStartDate(orderDto.getStartDate());
                orderEntity.setArrivalDate(orderDto.getArrivalDate());
                orderEntity.setOrderDate(orderDto.getOrderDate());
               // orderEntity.setContainerEntity(addContainer(id));

        orderRepository.save(orderEntity);
    }

    public boolean checkIfExists(ContainerEntity oldContainer, ContainerEntity newContainer) {
        return oldContainer != null && oldContainer.equals(newContainer);
    }

}
