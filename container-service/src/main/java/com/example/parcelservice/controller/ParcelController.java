package com.example.parcelservice.controller;

import com.example.parcelservice.entity.ParcelEntity;
import com.example.parcelservice.repository.ParcelRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class ParcelController {

    private static final String X_PREMIUM_CUSTOMER_HEADER = "X-Premium-Customer";

    private ParcelRepository parcelRepository;

    public ParcelController(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    @GetMapping("/parcels")
    public List<ParcelEntity> allProducts() {
        return this.parcelRepository.findAll();
    }
}
