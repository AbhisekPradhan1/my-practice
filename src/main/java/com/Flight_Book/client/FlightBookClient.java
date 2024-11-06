package com.Flight_Book.client;

import com.Flight_Book.config.FeignConfig;
import com.Flight_Book.model.FlightBookRequest;
import com.Flight_Book.model.FlightBookResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "FlightBookClient", url = "http://api.tektravels.com/BookingEngineService_Air/AirService.svc/rest", configuration = FeignConfig.class)
public interface FlightBookClient {

    @PostMapping("/Book")
    FlightBookResponse getBookFromTbo(@RequestBody FlightBookRequest flightBookRequest);
}