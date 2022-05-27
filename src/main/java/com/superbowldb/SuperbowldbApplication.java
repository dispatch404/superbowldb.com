package com.superbowldb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
//@EntityScan(basePackages= {"com.superbowldb.model"})
//@ComponentScan(basePackages= {"com.superbowldb.service", "com.superbowldb.repository"})
//@EnableJpaRepositories("com.superbowldb.repository")
public class SuperbowldbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SuperbowldbApplication.class, args);
	}
	
}