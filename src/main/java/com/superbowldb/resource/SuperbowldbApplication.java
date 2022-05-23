package com.superbowldb.resource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages= {"com.superbowl.model"})
public class SuperbowldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperbowldbApplication.class, args);
	}

}
