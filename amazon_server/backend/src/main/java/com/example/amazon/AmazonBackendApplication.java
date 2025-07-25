package com.example.amazon;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@SpringBootApplication
@EnableScheduling 
public class AmazonBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmazonBackendApplication.class, args);
	}


}
