package com.Flight_Book.controller;
import com.Flight_Book.model.FlightBookRequest;
import com.Flight_Book.model.FlightBookResponse;
import com.Flight_Book.service.service.FlightBookService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/flight")
public class FlightBook {

    private final FlightBookService flightBookService;
    public FlightBook(FlightBookService flightBookService) {
        this.flightBookService = flightBookService;
    }


    @PostMapping("/book")
    public ResponseEntity<FlightBookResponse> getBook(@RequestBody FlightBookRequest request) {
        try {
            FlightBookResponse flightBookResponse = flightBookService.getBook(request);

            return ResponseEntity.ok(flightBookResponse);
        } catch (Exception e) {

            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
