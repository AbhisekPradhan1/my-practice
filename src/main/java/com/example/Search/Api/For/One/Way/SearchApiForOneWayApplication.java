package com.example.Search.Api.For.One.Way;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
public class SearchApiForOneWayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SearchApiForOneWayApplication.class, args);
	}

}
