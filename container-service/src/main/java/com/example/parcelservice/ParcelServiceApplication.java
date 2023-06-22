package com.example.parcelservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class ParcelServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParcelServiceApplication.class, args);
	}

}
