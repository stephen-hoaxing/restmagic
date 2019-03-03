package com.nidal.rest.restexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.nidal.rest.restexample.resource"})
public class RestexampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestexampleApplication.class, args);
	}

}
