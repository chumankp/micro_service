
package com.ms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringCloudFoundryApplication {
	
	@GetMapping("/hello")
	public String getMessageServices(){
		return "Welcome to Cloud Foundry Services First application by chuman";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudFoundryApplication.class, args);
	}
}
