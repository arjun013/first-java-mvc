package com.exa.kkk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.*")
public class AlienateApplication {

	public static void main(String[] args) {
		SpringApplication.run(AlienateApplication.class, args);
	}

}
