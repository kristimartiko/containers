package com.example.parcelservice.service;

import com.example.parcelservice.dto.ContainerDto;
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

    public void addContainer(ContainerDto containerDto) {
        ContainerEntity container = ContainerEntity.builder()
                .id(Long.parseLong(String.valueOf(Math.random())))
                .description(containerDto.getDescription())
                .weight(containerDto.getWeight())
                .temperature(containerDto.getTemperature())
                .humidity(containerDto.getHumidity())
                .airPressure(containerDto.getAirPressure())
                .acceleration(containerDto.getAcceleration()).build();

        this.parcelRepository.save(container);
    }
}
