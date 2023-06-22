package com.example.parcelservice.service;

import com.example.parcelservice.entity.ContainerEntity;
import com.example.parcelservice.repository.ContainerRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class ContainerService {

    final ContainerRepository parcelRepository;

    public java.util.List<ContainerEntity> getAllParcels() {
        return this.parcelRepository.findAll();
    }
}
