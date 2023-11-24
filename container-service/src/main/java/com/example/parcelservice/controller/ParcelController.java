package com.example.parcelservice.controller;

import com.example.parcelservice.dto.ContainerDto;
import com.example.parcelservice.entity.ContainerEntity;
import com.example.parcelservice.rabbit.RabbitMqProducer;
import com.example.parcelservice.repository.ContainerRepository;
import com.example.parcelservice.service.ContainerService;
import lombok.Data;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
@Data
public class ParcelController {

    private final ContainerRepository parcelRepository;
    private final ContainerService containerService;
    private final RabbitMqProducer rabbitMqProducer;

    @GetMapping("/parcels")
    public List<ContainerEntity> allProducts() {
        return this.parcelRepository.findAll();
    }

    @PostMapping("/addContainer")
    public void addContainer(@RequestBody ContainerDto containerDto) throws Exception {
        this.containerService.addContainer(containerDto);
        String args = "";
       // rabbitMqProducer.run(args);
    }
}
