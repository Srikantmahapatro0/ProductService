package com.productservice.project1.a;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "controller")
public class Project1Application {

	public static void main(String[] args) {
		SpringApplication.run(Project1Application.class, args);
          
	}

}
