package com.example.orderservice.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Entity
@Data
@Table(name = "container")
public class ContainerEntity implements Serializable {

    @Id
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

    public ContainerEntity(long l, String parcel4, BigDecimal bigDecimal, BigDecimal bigDecimal1, BigDecimal bigDecimal2, BigDecimal bigDecimal3, BigDecimal bigDecimal4) {
    }

    public ContainerEntity() {}
}
