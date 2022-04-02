package com.example.rentcar.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class PracticeApplication {

	public static void main(String[] args) {
		SpringApplication.run(PracticeApplication.class, args);
	}

}
