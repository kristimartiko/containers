package com.example.parcelservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "container")
public class ContainerEntity implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "containerId")
    private Long containerId;

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

    public ContainerEntity(long l, String parcel1, BigDecimal bigDecimal,
                           BigDecimal bigDecimal1, BigDecimal bigDecimal2,
                           BigDecimal bigDecimal3, BigDecimal bigDecimal4) {

        this.containerId = l;
        this.description = parcel1;
        this.weight = bigDecimal;
        this.temperature = bigDecimal1;
        this.humidity = bigDecimal2;
        this.airPressure = bigDecimal3;
        this.acceleration = bigDecimal4;
    }

    public ContainerEntity() {

    }
}

