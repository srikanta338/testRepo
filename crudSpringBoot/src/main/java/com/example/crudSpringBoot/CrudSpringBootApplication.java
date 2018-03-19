package com.example.crudSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class CrudSpringBootApplication {

	public static void main(String[] args) {
		System.out.println("Application Started");
		SpringApplication.run(CrudSpringBootApplication.class, args);
	}
}
