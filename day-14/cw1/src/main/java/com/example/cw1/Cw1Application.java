package com.example.cw1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;

@SpringBootApplication
@OpenAPIDefinition
public class Cw1Application {

	public static void main(String[] args) {
		SpringApplication.run(Cw1Application.class, args);
	}

}
