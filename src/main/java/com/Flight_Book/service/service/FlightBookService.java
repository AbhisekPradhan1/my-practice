package com.Flight_Book.service.service;

import com.Flight_Book.model.FlightBookRequest;
import com.Flight_Book.model.FlightBookResponse;

public interface FlightBookService {
    FlightBookResponse getBook(FlightBookRequest request);
}
