package com.example.Search.Api.For.One.Way.Controller;



import com.example.Search.Api.For.One.Way.Service.service.OneWaySearchService;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchRequestDTO;
import com.example.Search.Api.For.One.Way.module.DTO.OneWaySearchResponseDTO;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/search")
@RequiredArgsConstructor
public class OneWaySearchController {

    private final OneWaySearchService oneWaySearchService;
    private final Logger logger = LoggerFactory.getLogger(OneWaySearchController.class); // Logger instance

    @PostMapping("/one-way")
    public ResponseEntity<OneWaySearchResponseDTO> searchOneWayFlights(@RequestBody OneWaySearchRequestDTO request) {
        logger.info("Received search request: {}", request);
        OneWaySearchResponseDTO response = oneWaySearchService.searchFlights(request);
        logger.info("Search response: {}", response);
        return ResponseEntity.ok(response);
    }
}
