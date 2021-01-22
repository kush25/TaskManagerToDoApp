package com.hcl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.hcl")
public class SpringBootTestCrudApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootTestCrudApplication.class, args);
	}

}
