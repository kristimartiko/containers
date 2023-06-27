package com.example.orderservice;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class OrderDto {
    String origin;
    String destination;
    String currentLocation;
    LocalDateTime startDate;
    LocalDateTime arrivalDate;
    LocalDateTime orderDate;
}
