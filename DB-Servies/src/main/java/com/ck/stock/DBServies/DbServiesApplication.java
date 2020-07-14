package com.ck.stock.DBServies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
@EnableAutoConfiguration
public class DbServiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(DbServiesApplication.class, args);
	}
}
