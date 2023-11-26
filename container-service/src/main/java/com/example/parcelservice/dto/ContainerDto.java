package com.example.parcelservice.dto;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ContainerDto {
    private Long id;
    private String description;
    private BigDecimal weight;
    private BigDecimal temperature;
    private BigDecimal humidity;
    private BigDecimal airPressure;
    private BigDecimal acceleration;
}
