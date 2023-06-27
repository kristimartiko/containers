package com.example.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

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

    @Column private LocalDateTime startDate;

    @Column private LocalDateTime arrivalDate;

    @Column private LocalDateTime orderDate;

    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "containerId")
    private ContainerEntity containerEntity;
}
