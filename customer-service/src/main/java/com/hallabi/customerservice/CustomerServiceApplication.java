package com.hallabi.customerservice;

import com.hallabi.customerservice.entities.Customer;
import com.hallabi.customerservice.repository.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CustomerServiceApplication {

	public static void main(String[] args) {

		SpringApplication.run(CustomerServiceApplication.class, args);
	}

	@Bean
	CommandLineRunner start(CustomerRepository customerRepository) {
		return args -> {
				customerRepository.save(Customer.builder()
						.name("Sami")
						.email("sam@gmail.com")
				.build());
			customerRepository.save(Customer.builder()
					.name("marwa")
					.email("marwa@gmail.com")
					.build());
			customerRepository.save(Customer.builder()
					.name("Brahim")
					.email("ibra@gmail.com")
					.build());
		};
	}
}
