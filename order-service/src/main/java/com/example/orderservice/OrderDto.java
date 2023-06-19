package com.example.orderservice;

import lombok.Data;

@Data
public class OrderDto {
    String origin;
    String destination;
    String currentLocation;
    String startDate;
    String arrivalDate;
    String orderDate;
    long parcelId;
}
