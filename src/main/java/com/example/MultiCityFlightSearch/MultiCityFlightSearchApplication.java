package com.example.MultiCityFlightSearch;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class MultiCityFlightSearchApplication {

	public static void main(String[] args) {
		SpringApplication.run(MultiCityFlightSearchApplication.class, args);
	}

}
