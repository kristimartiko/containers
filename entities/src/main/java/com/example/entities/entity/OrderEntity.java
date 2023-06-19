package com.example.entities.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "orders")
public class OrderEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    String origin;

    @Column String destination;

    @Column String currentLocation;

    @Column String startDate;

    @Column String arrivalDate;

    @Column String orderDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "containerId")
    private ContainerEntity containerEntity;
}
