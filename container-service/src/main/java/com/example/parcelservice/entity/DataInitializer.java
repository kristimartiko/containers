package com.example.parcelservice.entity;

import com.example.parcelservice.repository.ParcelRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Stream;

@Component
public class DataInitializer implements CommandLineRunner {

    final ParcelRepository parcelRepository;

    public DataInitializer(ParcelRepository parcelRepository) {
        this.parcelRepository = parcelRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        List<ParcelEntity> parcels = Stream.of(
                new ParcelEntity(1L, "Parcel1", new BigDecimal(50), new BigDecimal(12),
                        new BigDecimal(34), new BigDecimal(35), new BigDecimal(80)),
                new ParcelEntity(2L, "Parcel2", new BigDecimal(50), new BigDecimal(12),
                        new BigDecimal(34), new BigDecimal(35), new BigDecimal(80)),
                new ParcelEntity(3L, "Parcel3", new BigDecimal(50), new BigDecimal(12),
                        new BigDecimal(34), new BigDecimal(35), new BigDecimal(80)),
                new ParcelEntity(4L, "Parcel4", new BigDecimal(50), new BigDecimal(12),
                        new BigDecimal(34), new BigDecimal(35), new BigDecimal(80))).map(parcelRepository::save).toList();
    }
}
