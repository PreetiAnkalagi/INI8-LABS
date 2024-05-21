package com.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.mvc"})
public class SpringEmployeeCurdExApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEmployeeCurdExApplication.class, args);
	}

}
