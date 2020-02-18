package com.example.circuit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CircuitBreakerBookStoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(CircuitBreakerBookStoreApplication.class, args);
	}
	
	@RequestMapping("/recommended")
	public String readingList() throws InterruptedException {
		Thread.sleep(5 * 60 * 100);
		throw new InterruptedException();
//		return "Spring in Action (Manning),"
//				+ " Cloud Native Java (O'Reilly),"
//				+ " Learning Spring Boot (Packt)";
	}

}
