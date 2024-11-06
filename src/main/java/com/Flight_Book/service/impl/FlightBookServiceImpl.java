package com.Flight_Book.service.impl;

import com.Flight_Book.client.FlightBookClient;
import com.Flight_Book.model.FlightBookRequest;
import com.Flight_Book.model.FlightBookResponse;
import com.Flight_Book.service.service.FlightBookService;
import org.springframework.stereotype.Service;

@Service
public class FlightBookServiceImpl implements FlightBookService {
    private final FlightBookClient flightBookClient;

    public FlightBookServiceImpl(FlightBookClient flightBookClient) {
        this.flightBookClient = flightBookClient;
    }
    @Override
    public FlightBookResponse getBook(FlightBookRequest request) {
        return flightBookClient.getBookFromTbo(request);
    }
}
