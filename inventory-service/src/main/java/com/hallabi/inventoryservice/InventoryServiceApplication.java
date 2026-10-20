package com.hallabi.inventoryservice;

import com.hallabi.inventoryservice.entities.Product;
import com.hallabi.inventoryservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(InventoryServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(ProductRepository ProductRepository) {
		return args -> {
			ProductRepository.save(Product.builder()
					.name("Computer")
					.price(6500)
					.quantity(12)
					.build());

			ProductRepository.save(Product.builder()
					.name("Phone")
					.price(12000)
					.quantity(10)
					.build());

			ProductRepository.save(Product.builder()
					.name("printer")
					.price(4500)
					.quantity(7)
					.build());
		};
	}
}

