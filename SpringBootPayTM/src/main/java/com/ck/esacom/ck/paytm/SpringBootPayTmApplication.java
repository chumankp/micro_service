package com.ck.esacom.ck.paytm;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootPayTmApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootPayTmApplication.class, args);
	}

}
