package com.example.orderservice.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "containerOrder")
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

    @ManyToOne()
    @JoinColumn(name = "containerId", referencedColumnName = "id")
    private ContainerEntity containerEntity;
}
