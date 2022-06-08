package com.superbowldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;

@SpringBootApplication
@OpenAPIDefinition(info = @Info(title = "SuperbowlDB API", version = "1.0.0", description = "Superbowl data"))
public class SuperbowldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperbowldbApplication.class, args);
	}
	
}