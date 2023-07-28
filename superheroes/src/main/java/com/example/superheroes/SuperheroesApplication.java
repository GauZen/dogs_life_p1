package com.example.superheroes;

import com.example.superheroes.practice.Calculator;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SuperheroesApplication implements CommandLineRunner {

	@Autowired
	Calculator calc;
	public static void main(String[] args) {
		SpringApplication.run(SuperheroesApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hallo World");
		int result = calc.addition(3,4);
		System.out.println(result);
	}

	@PreDestroy
	public void destroy(){
		System.out.println("Calculator will be destroyed");
	}

	@PostConstruct
	public void intit(){
		System.out.println("Calculator has been destroyed");
	}


}
