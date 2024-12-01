package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication{

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAOimpl studentDAOimpl) {
		return args -> {
			System.out.println("Aplikacja wystartowała!");
		};
	}
	private void createStunent(StudentDAOimpl studentDAOimpl){

	}
}
