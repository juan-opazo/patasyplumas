package com.patasplumas.petcareappint;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.patasplumas.controller","com.patasplumas.service"})
@EntityScan("com.patasplumas.model")
@EnableJpaRepositories("com.patasplumas.repository")
public class PetCareAppIntApplication {

	public static void main(String[] args) {
		SpringApplication.run(PetCareAppIntApplication.class, args);
	}

}
