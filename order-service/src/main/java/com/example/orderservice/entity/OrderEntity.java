package com.example.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;

@Entity
@Data
@Table(name = "orders")
public class OrderEntity implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column private String origin;

    @Column private String destination;

    @Column private String currentLocation;

    @Column private String startDate;

    @Column private String arrivalDate;

    @Column private String orderDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "containerId")
    private ContainerEntity containerEntity;
}
