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
    final MessageProducer messageProducer;

    public ContainerService(ContainerRepository parcelRepository, MessageProducer messageProducer) {
        this.parcelRepository = parcelRepository;
        this.messageProducer = messageProducer;
    }

    public java.util.List<ContainerEntity> getAllParcels() {
        return this.parcelRepository.findAll();
    }

    public void addContainer(ContainerDto containerDto) {
        ContainerEntity container = new ContainerEntity();
        container.setAcceleration(containerDto.getAcceleration());
        container.setDescription(containerDto.getDescription());
        container.setWeight(containerDto.getWeight());
        container.setTemperature(containerDto.getTemperature());
        container.setAirPressure(containerDto.getAirPressure());
        container.setHumidity(containerDto.getHumidity());

        this.parcelRepository.save(container);
        this.messageProducer.sendMessage("topic-id", container.toString());
    }
}
