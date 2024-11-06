package com.Flight_Book;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class BookForFlightApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookForFlightApplication.class, args);
	}

}
