package com.example.parcelservice.controller;

import com.example.parcelservice.entity.ContainerEntity;
import com.example.parcelservice.repository.ContainerRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParcelController {

    private ContainerRepository parcelRepository;

    public ParcelController(ContainerRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    @GetMapping("/parcels")
    public List<ContainerEntity> allProducts() {
        return this.parcelRepository.findAll();
    }
}
