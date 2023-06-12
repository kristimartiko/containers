package com.example.parcelservice.repository;

import com.example.parcelservice.entity.ParcelEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ParcelRepository extends JpaRepository<ParcelEntity, Long> {
}
