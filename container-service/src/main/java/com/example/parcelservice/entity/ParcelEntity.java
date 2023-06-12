package com.example.parcelservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigDecimal;

@Entity
public class ParcelEntity {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "description")
    private String description;

    @Column
    private BigDecimal weight;

    @Column
    private BigDecimal temperature;

    @Column
    private BigDecimal humidity;

    @Column
    private BigDecimal airPressure;

    @Column
    private BigDecimal acceleration;

    public ParcelEntity(Long id, String description, BigDecimal weight,
                        BigDecimal temperature, BigDecimal humidity,
                        BigDecimal airPressure, BigDecimal acceleration) {
        this.id = id;
        this.description = description;
        this.weight = weight;
        this.temperature = temperature;
        this.humidity = humidity;
        this.airPressure = airPressure;
        this.acceleration = acceleration;
    }

    public ParcelEntity() {}

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getTemperature() {
        return temperature;
    }

    public void setTemperature(BigDecimal temperature) {
        this.temperature = temperature;
    }

    public BigDecimal getAcceleration() {
        return acceleration;
    }

    public void setAcceleration(BigDecimal acceleration) {
        this.acceleration = acceleration;
    }

    public BigDecimal getAirPressure() {
        return airPressure;
    }

    public void setAirPressure(BigDecimal airPressure) {
        this.airPressure = airPressure;
    }

    public BigDecimal getHumidity() {
        return humidity;
    }

    public void setHumidity(BigDecimal humidity) {
        this.humidity = humidity;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

}
